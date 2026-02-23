package com.hung.backend.controller;

import com.hung.backend.model.Product;
import com.hung.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products") // Địa chỉ để bạn gõ trên trình duyệt
@CrossOrigin(origins = "*") // Quan trọng: Để JavaScript ở dự án Frontend của bạn gọi vào được
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  public List<Product> getAllProducts() {
    return productRepository.findAll(); // Lấy tất cả sản phẩm từ DB trả về cho Web
  }
  @PostMapping
  public Product addProduct(@RequestBody Product product) {
    return productRepository.save(product);
  }
}