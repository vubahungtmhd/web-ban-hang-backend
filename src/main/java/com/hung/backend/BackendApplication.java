package com.hung.backend;

import com.hung.backend.model.Product;
import com.hung.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(ProductRepository repository){
		return args -> {

			System.out.println("Java tu dong them du lieu vao MySQL");
			Product p1=new Product();
			p1.setName("Cây bàng Singapore");
			p1.setPrice(120000.0);
			p1.setImg("bang-sin.jpg");
			p1.setCategory("de-ban");
			p1.setDescription("Cây để bàn: ");
			repository.save(p1);

			System.out.println("Đã thêm: "+p1.getName());
		};

	}

}
