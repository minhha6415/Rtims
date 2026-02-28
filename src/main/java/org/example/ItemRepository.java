package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    // Các method có sẵn từ JpaRepository: save(), findAll(), findById(), deleteById()...

    // Method tìm kiếm tùy chỉnh (Spring Data JPA tự sinh SQL)
    List<Item> findByNameContainingIgnoreCase(String name);

    List<Item> findByCategoryIgnoreCase(String category);
}