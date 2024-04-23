package com.example.finalproject.domain.admin;

import com.example.finalproject._core.error.exception.Exception400;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepository;

    //회원가입
    @Transactional
    public Admin join(AdminRequest.JoinDTO reqDTO){
        Optional<Admin> adminOP = adminRepository.findByEmail(reqDTO.getEmail());
        if (adminOP.isPresent()){
            throw new Exception400("중복된 이메일이 있습니다.");
        }

        Admin admin = null;


        if(reqDTO.getRole().equals(Admin.AdminRole.ADMIN)){
            admin = adminRepository.save(reqDTO.toAdminEntity());
        } else if (reqDTO.getRole().equals(Admin.AdminRole.BRAND)) {
            admin = adminRepository.save(reqDTO.toBrandEntity());
        }



        return admin;
    }
}
