package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class PizzaPedidaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizzaPedidaIngrediente;

    @ManyToOne
    @JoinColumn(name = "idPizzaPedida")
    private PizzaPedida pizzaPedida;

    @ManyToOne
    @JoinColumn(name = "idIngrediente")
    private Ingrediente ingrediente;

    public PizzaPedidaIngrediente() {
    }

    public long getIdPizzaPedidaIngrediente() {
        return idPizzaPedidaIngrediente;
    }

    public void setIdPizzaPedidaIngrediente(long idPizzaPedidaIngrediente) {
        this.idPizzaPedidaIngrediente = idPizzaPedidaIngrediente;
    }

    public PizzaPedida getPizzaPedida() {
        return pizzaPedida;
    }

    public void setPizzaPedida(PizzaPedida pizzaPedida) {
        this.pizzaPedida = pizzaPedida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}