package com.pizzariafatiafeliz.pizzariaapi.models;


import jakarta.persistence.*;

@Entity
public class Bebida {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idBebida;

        @Column
        private String nome;

        @Column
        private Float preco;

        public Bebida() {

        }
        // Getters e Setters


        public Long getIdBebida() {
                return idBebida;
        }

        public void setIdBebida(Long idBebida) {
                this.idBebida = idBebida;
        }

        public Float getPreco() {
                return preco;
        }

        public void setPreco(Float preco) {
                this.preco = preco;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
}
