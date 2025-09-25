package com.playstore.playstore.resources;

import com.playstore.playstore.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<Category> findAll() {
        Category y = new Category(1L, "eletronico");
        return ResponseEntity.ok().body(y);
    }
}
