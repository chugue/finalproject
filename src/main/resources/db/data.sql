-- --관리자 테이블--
insert into admin_tb(email, password, brand_name, role, address, business_num, update_at, created_at)
values ('Ropa@naver.com', '1234', 'Ropa', 'BRAND', '서울특별시 강남구', '827-546-7895', NULL, '2023-01-10 08:30:00'),
       ('Ace@naver.com', '1234', 'Ace', 'BRAND', '서울특별시 종로구', '737-546-7196', NULL, '2023-01-10 08:30:00'),
       ('BB@naver.com', '1234', 'BB', 'BRAND', '서울특별시 강동구', '657-546-2897', NULL, '2023-01-10 08:30:00'),
       ('Admin@naver.com', '1234', null, 'ADMIN', '부산광역시 해운대구', '1234', NULL, '2023-01-10 08:30:00');

--
-- --
--
-- --사용자 테이블--
-- INSERT INTO `user_tb` (myName, nickName, photo, height, weight, address, mobile, email, blueChecked, updatedAt,
--                        createdAt, photo_id)
-- VALUES ('서강준', 'gangjun', 'hong.jpg', '175 cm', '70 kg', '서울시 강남구 역삼동 123번지', '010-1234-5678', 'gangjun@naver.com',
--         false, 2024 - 04 - 20 10:15:00, 2023 - 01 - 15 08:30:00, null),
--        ('김영희', 'younghee', 'young.jpg', '163 cm', '60 kg', '부산시 해운대구 우동 456번지', '010-9876-5432', 'younghee@naver.com',
--         false, 2024 - 04 - 20 09:30:00, 2023 - 01 - 16 08:30:00, null),
--        ('이철수', 'chulsoo', 'chul.jpg', '180 cm', '80 kg', '대구시 중구 삼덕동 789번지', '010-8765-4321', 'chulsoo@naver.com',
--         false, 2024 - 04 - 19 15:45:00, 2023 - 01 - 17 08:30:00, null),
--        ('신예은', 'yeeun', 'yeeun.jpg', '168 cm', '55 kg', '인천시 남동구 구월동 101번지', '010-0123-4567', 'yeeun@naver.com', false,
--         2024 - 04 - 18 11:20:00, 2023 - 01 - 18 08:30:00, null),
--        ('설인아', 'ina', 'ina.jpg', '164 cm', '52 kg', '인천시 남동구 구월동 101번지', '010-3215-4795', 'ina@naver.com', false,
--         2024 - 04 - 18 11:20:00, 2023 - 01 - 19 08:30:00, null);
--
--

