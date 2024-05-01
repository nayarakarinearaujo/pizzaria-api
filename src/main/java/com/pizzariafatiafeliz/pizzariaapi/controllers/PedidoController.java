package com.pizzariafatiafeliz.pizzariaapi.controllers;

import com.pizzariafatiafeliz.pizzariaapi.models.Pedido;
import com.pizzariafatiafeliz.pizzariaapi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @RequestMapping(value = "/criar/Pedido",method = RequestMethod.POST)
    public Pedido save(@RequestBody Pedido pedido)
    {
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }

    @RequestMapping(value = "/mostrar/Pedido",method = RequestMethod.GET )
    public List<Pedido> findAll(){
        List<Pedido> pedido = this.pedidoRepository.findAll();
        return pedido;
    }


    @RequestMapping(value = "/mostrar/Pedido/{id}",method = RequestMethod.GET )
    public Pedido findByid(@PathVariable Long id)    {
        Optional<Pedido> resultado = this.pedidoRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Pedido não encontrado");
        } else {
            return resultado.get();}
    }

    @RequestMapping(value = "Pedido/excluir/{id}", method = RequestMethod.GET)
    public Pedido deleteById(@PathVariable Long id)    {
        Pedido pedido =  findByid(id);
        this.pedidoRepository.deleteById(id);
        return pedido;
    }

    @RequestMapping(value = "Pedido/editar/{id}", method = RequestMethod.PUT)
    public Pedido editarById(@PathVariable Long id, @RequestBody Pedido pedido)    {
        this.findByid(id);
        pedido.setIdPedido(id);
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }
}