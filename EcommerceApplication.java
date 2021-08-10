package com.anupa.ecommerce;

import com.anupa.ecommerce.model.Product;
import com.anupa.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(100L, "Mac Book Pro 15 inch", 300.00));
            productService.save(new Product(102L, "Lenovo T14", 200.00));
            productService.save(new Product(103L, "HP Spectre", 100.00));
            productService.save(new Product(104L, "Sony Vaio", 5.00));

        };
    }
}
