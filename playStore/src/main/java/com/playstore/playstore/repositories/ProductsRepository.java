package com.playstore.playstore.repositories;

import com.playstore.playstore.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
