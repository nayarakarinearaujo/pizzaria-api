package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Tamanho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTamanho;

    @Column
    private String nome;

    @Column
    private Float desconto;



    public Tamanho(){}


    public long getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(long idTamanho) {
        this.idTamanho = idTamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }
}
