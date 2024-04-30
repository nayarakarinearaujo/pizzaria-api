package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngrediente;


    // Associação muitos-para-um com a classe Pedido
    @ManyToOne
    @JoinColumn(name = "pedido_id") //Especifica a coluna na tabela de banco de dados que é usada para a associação.
    private Pedido pedido;


}
