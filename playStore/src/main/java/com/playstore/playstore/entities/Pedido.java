package com.playstore.playstore.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private LocalDate dataPedido;
    private String status;

    public Pedido(){

    }

    public Pedido(Long id, LocalDate dataPedido, String status){
        this.id = id;
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido order = (Pedido) o;
        return Objects.equals(id, order.id) && Objects.equals(dataPedido, order.dataPedido) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataPedido, status);
    }
}
