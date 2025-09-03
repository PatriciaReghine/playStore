package com.playstore.playstore.repositories;

import com.playstore.playstore.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category,Long> {
}
