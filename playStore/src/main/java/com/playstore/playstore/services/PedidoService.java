package com.playstore.playstore.services;

import com.playstore.playstore.entities.Pedido;
import com.playstore.playstore.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> busqueTodos(){
        return pedidoRepository.findAll();
    }

    public Pedido buscarPeloId(Long id){
        Optional<Pedido> objeto = pedidoRepository.findById(id);
        return objeto.get();
    }

}
