package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPizza;

    @Column
    private String nome;

    @Column
    private Float precoBase;

    @Column
    private boolean personalizada;

    public Pizza() {

    }

    public long getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(long idPizza) {
        this.idPizza = idPizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }

    public Float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Float precoBase) {
        this.precoBase = precoBase;
    }
}

