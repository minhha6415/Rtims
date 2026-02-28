package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RtimsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RtimsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository) {
        return args -> {
            // Chỉ thêm nếu database chưa có dữ liệu
            if (itemRepository.count() == 0) {
                itemRepository.save(new Item(null, "iPhone 15", "Chính hãng VN/A", 30, 25_000_000.0, "Điện thoại"));
                itemRepository.save(new Item(null, "MacBook Air M2", "Chip M2, RAM 16GB", 10, 35_000_000.0, "Laptop"));
                itemRepository.save(new Item(null, "Tai nghe AirPods Pro 2", "Chống ồn chủ động", 50, 6_500_000.0, "Phụ kiện"));
                itemRepository.save(new Item(null, "Samsung Galaxy S24", "Camera 200MP", 20, 22_000_000.0, "Điện thoại"));
                System.out.println("Đã tự động thêm 4 sản phẩm mẫu vào database!");
            }
        };
    }
}