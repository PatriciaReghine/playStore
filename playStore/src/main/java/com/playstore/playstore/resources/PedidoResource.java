package com.playstore.playstore.resources;

import com.playstore.playstore.entities.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/order")

public class PedidoResource {
    @GetMapping
    public ResponseEntity<Pedido> findAll(){
        Pedido x = new Pedido(null, LocalDate.of(2025,10,05), "Efetivado");
        return ResponseEntity.ok().body(x);
    }
}
