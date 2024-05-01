package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;
@Entity
public class BebidaPedida {

    // Identificador único para a BebidaPedida
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBebidaPedida;

    @ManyToOne
    @JoinColumn(name = "idBebida")
    private Bebida bebida;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;

    @Column
    private int quantidade;

    public BebidaPedida() {

    }

    public long getIdBebidaPedida() {
        return idBebidaPedida;
    }

    public void setIdBebidaPedida(long idBebidaPedida) {
        this.idBebidaPedida = idBebidaPedida;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
