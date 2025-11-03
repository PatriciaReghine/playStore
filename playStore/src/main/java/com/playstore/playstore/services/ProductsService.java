package com.playstore.playstore.services;

import com.playstore.playstore.entities.Products;
import com.playstore.playstore.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

    // Retorna todos os produtos
    public List<Products> findAll() {
        return repository.findAll();
    }

    // Retorna apenas produtos com estoque > 0
    public List<Products> findProdutosDisponiveis() {
        return repository.findAll().stream()
                .filter(p -> p.getEstoque() != null && p.getEstoque() > 0)
                .collect(Collectors.toList());
    }

    public List<Products> findProdutosIndisponiveis() {
        return repository.findAll().stream()
                .filter(p -> p.getEstoque() != null && p.getEstoque() == 0)
                .collect(Collectors.toList());
    }

    // Retorna um resumo numérico de quantidade de produtos
    public Map<String, Long> getResumoQuantidade() {
        List<Products> todosProdutos = repository.findAll();
        long total = todosProdutos.size();
        long indisponiveis = todosProdutos.stream()
                .filter(p -> p.getEstoque() != null && p.getEstoque() == 0)
                .count();

        Map<String, Long> resumo = new HashMap<>();
        resumo.put("totalProdutos", total);
        resumo.put("produtosIndisponiveis", indisponiveis);

        return resumo;
    }
}
