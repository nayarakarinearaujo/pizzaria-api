package com.pizzariafatiafeliz.pizzariaapi.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFornada;
    // Tipo de dado: byte, pois armazenará valores pequenos como números
    private byte numFornada;
    private byte qtdPizzas;


    // Getters e Setters


    public Long getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(Long idFornada) {
        this.idFornada = idFornada;
    }

    public byte getNumFornada() {
        return numFornada;
    }

    public void setNumFornada(byte numFornada) {
        this.numFornada = numFornada;
    }

    public byte getQtdPizzas() {
        return qtdPizzas;
    }

    public void setQtdPizzas(byte qtdPizzas) {
        this.qtdPizzas = qtdPizzas;
    }
}
