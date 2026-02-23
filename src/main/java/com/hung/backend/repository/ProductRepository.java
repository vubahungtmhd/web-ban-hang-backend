package com.hung.backend.repository;

import com.hung.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  // Không cần viết gì thêm, Spring sẽ tự lo việc Lấy/Thêm/Sửa/Xóa
}