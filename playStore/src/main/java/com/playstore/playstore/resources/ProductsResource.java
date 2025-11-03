package com.playstore.playstore.resources;

import com.playstore.playstore.entities.Products;
import com.playstore.playstore.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductsResource {

    @Autowired
    private ProductsService productsService;

    // Endpoint para listar todos os produtos
    @GetMapping
    public ResponseEntity<List<Products>> findAll() {
        List<Products> produtos = productsService.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    // Endpoint para listar apenas produtos com estoque > 0
    @GetMapping("/disponiveis")
    public ResponseEntity<List<Products>> getProdutosDisponiveis() {
        List<Products> produtosDisponiveis = productsService.findProdutosDisponiveis();
        return ResponseEntity.ok().body(produtosDisponiveis);
    }

    @GetMapping("/indisponiveis")
    public ResponseEntity<List<Products>> getProdutosIndisponiveis() {
        List<Products> produtosIndisponiveis = productsService.findProdutosIndisponiveis();
        return ResponseEntity.ok().body(produtosIndisponiveis);
    }

    @GetMapping("/quantidade")
    public ResponseEntity<Map<String, Long>> getResumoQuantidade() {
        Map<String, Long> resumo = productsService.getResumoQuantidade();
        return ResponseEntity.ok().body(resumo);
    }
}
