package com.pizzariafatiafeliz.pizzariaapi.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Adicionando o campo idPedido
    private Long idPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private Long fornadaId;

    private Timestamp dataHora;



    //Métodos de acesso
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter e Setter para idPedido
    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getFornadaId() {
        return fornadaId;
    }

    public void setFornadaId(Long fornadaId) {
        this.fornadaId = fornadaId;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public void setPedido(String nayara) {

    }
}