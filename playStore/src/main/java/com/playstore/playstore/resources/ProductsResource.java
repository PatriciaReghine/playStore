package com.playstore.playstore.resources;

import com.playstore.playstore.entities.Products;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/products")

public class ProductsResource {
    @GetMapping
    public ResponseEntity<Products> findAll(){
        Products x = new Products(1,"Carregador", "Carregador de celular", Double.valueOf("15.99"), "123456");
        return ResponseEntity.ok().body(x);
    }
}
