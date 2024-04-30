package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

public class BebidaPedida {

    // Identificador único para a BebidaPedida
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    // Associação muitos-para-um com a classe Pedido
    @ManyToOne
    @JoinColumn(name = "pedido_id") //Especifica a coluna na tabela de banco de dados que é usada para a associação.
    private Pedido pedido;


    // Associação muitos-para-um com a classe Bebida
    @ManyToOne
    @JoinColumn(name = "bebida_id")
    private Bebida bebida;

    private int quantidade;


    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
