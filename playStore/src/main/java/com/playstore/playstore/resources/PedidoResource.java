package com.playstore.playstore.resources;

import com.playstore.playstore.entities.Pedido;
import com.playstore.playstore.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/order")

public class PedidoResource {

    @Autowired
    PedidoService orderService;

    @GetMapping
    public ResponseEntity<List<Pedido>> busqueTodosUsuarios(){
        List<Pedido> listaDeUsuarios = orderService.busqueTodos();
        return ResponseEntity.ok().body(listaDeUsuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarPorIdDoUsuario(@PathVariable Long id){
        Pedido order = orderService.buscarPeloId(id);
        return ResponseEntity.ok().body(order);
    }

}
