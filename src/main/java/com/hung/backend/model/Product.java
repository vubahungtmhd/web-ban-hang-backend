package com.hung.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data // Nếu bạn đã cài Lombok, nó sẽ tự tạo Getter/Setter
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Double price;
  private String img; // Lưu link ảnh (ví dụ: "cay-kim-tien.jpg")
  private String category;
  @Column(columnDefinition = "TEXT")
  private String description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public String getImg() {
    return img;
  }

  public String getDescription() {
    return description;
  }

  public String getCategory() {
    return category;
  }
}