package com.example.finalproject.domain.items;


import com.example.finalproject._core.error.exception.Exception401;
import com.example.finalproject._core.error.exception.Exception404;
import com.example.finalproject.domain.admin.Admin;
import com.example.finalproject.domain.admin.AdminRepository;
import com.example.finalproject.domain.category.Category;
import com.example.finalproject.domain.photo.Photo;
import com.example.finalproject.domain.photo.PhotoRepository;
import com.example.finalproject.domain.photo.PhotoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemsService {
    private final AdminRepository adminRepository;
    private final ItemsRepository itemsRepository;
    private final PhotoService photoService;
    private final PhotoRepository photoRepository;


    // 아이템 수정
    @Transactional
    public void updateItem(Integer itemId, ItemsRequest.UpdateDTO reqDTO, Integer sessionBrandId) {
        // Admin 정보 조회
        Admin admin = adminRepository.findById(sessionBrandId)
                .orElseThrow(() -> new Exception401("브랜드 관리자의 정보를 찾을 수 없습니다."));

        // 아이템 정보 조회
        Items items = itemsRepository.findById(itemId)
                .orElseThrow(() -> new Exception404("아이템을 찾을 수 없습니다."));

        List<Photo> itemsPhotos = photoRepository.findAllByItemsId(itemId);

        // 아이템 정보 업데이트
        items.setName(reqDTO.getName());
        items.setDescription(reqDTO.getDescription());
        items.setSize(reqDTO.getSize());
        items.setPrice(reqDTO.getPrice());
        items.setDiscountPrice(reqDTO.getDiscountPrice());
        items.setStock(reqDTO.getStock());
        itemsPhotos.forEach(photo -> {
            if (photo.getIsMainPhoto()){
                try {
                    photoService.updateMainImage(reqDTO.getMainImage(), photo, items);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    photoService.updateDetailImage(reqDTO.getDetailImage(), photo, items);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // 카테고리 정보 업데이트
        Category category = items.getCategory();
        category.setMain(reqDTO.getMainCategory());
        category.setSub(reqDTO.getSubCategory());

        // 엔티티 저장
        itemsRepository.save(items);
    }


    // 아이템 저장
    @Transactional
    public void saveItem(ItemsRequest.SaveDTO reqDTO, Integer sessionBrandId) {
        // Admin 정보 조회
        Admin admin = adminRepository.findById(sessionBrandId)
                .orElseThrow(() -> new Exception401("브랜드 관리자의 정보를 찾을 수 없습니다."));
        Items savedItems = itemsRepository.save(reqDTO.toEntity(admin));

        photoService.uploadItemMainImage(reqDTO.getMainImage(), savedItems);
        photoService.uploadItemDetailImage(reqDTO.getDetailImage(), savedItems);
    }

    // 아이템 목록
    public List<ItemsResponse.listDTO> findItemsByAdminId(Integer sessionBrandId) {
        // Admin 정보 조회
        Admin admin = adminRepository.findById(sessionBrandId)
                .orElseThrow(() -> new Exception401("브랜드 관리자의 정보를 찾을 수 없습니다."));

        List<Items> item = itemsRepository.findItemsByAdminId(sessionBrandId);
        return item.stream().map(ItemsResponse.listDTO::new).toList();
    }

    // 아이템 상세보기
    public ItemsResponse.DetailDTO findItemsByAdminIdAndItemId(Integer sessionAdminId, Integer itemId) {
        // Admin 정보 조회
        Admin admin = adminRepository.findById(sessionAdminId)
                .orElseThrow(() -> new Exception401("브랜드 관리자의 정보를 찾을 수 없습니다."));

        // 아이템 정보 조회
        Items items = itemsRepository.findItemsByAdminIdAndItemId(admin.getId(), itemId)
                .orElseThrow(() -> new Exception404("브랜드 아이템 정보를 찾을 수 없습니다."));

        // 아이템 사진 조회
        List<Photo> itemPhotos = photoRepository.findAllByItemsId(itemId);

        return new ItemsResponse.DetailDTO(items, itemPhotos);
    }


    // 아이템 삭제
    @Transactional
    public void deleteItem(Integer itemId, Admin sessionAdmin) {
        // Admin 정보 조회
        Admin admin = adminRepository.findById(sessionAdmin.getId())
                .orElseThrow(() -> new Exception401("브랜드 관리자의 정보를 찾을 수 없습니다."));

        // 아이템 정보 조회
        Items items = itemsRepository.findById(itemId)
                .orElseThrow(() -> new Exception404("아이템을 찾을 수 없습니다."));

        // 아이템 삭제 상태 업데이트
        items.setStatus(false);

        // 엔티티 저장
        itemsRepository.save(items);

        // 아이템에 연결된 사진 삭제
        photoService.deleteByItemId(itemId);
    }
}
