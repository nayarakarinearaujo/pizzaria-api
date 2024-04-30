package com.pizzariafatiafeliz.pizzariaapi.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bebida {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long idBebida;
        private String nome;
        private Double preco;


        // Getters e Setters

        public Long getIdBebida() {
                return idBebida;
        }

        public void setIdBebida(Long idBebida) {
                this.idBebida = idBebida;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Double getPreco() {
                return preco;
        }

        public void setPreco(Double preco) {
                this.preco = preco;
        }
}
