package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class PizzaPedida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaPedida;


    //Para vincular outro já criado.
    @ManyToOne
    @JoinColumn(name = "idPizza")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idTamanho")
    private Tamanho tamanho;

    @Column
    private  int quantidade;



    public long getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(long idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public PizzaPedida() {


    }
}
