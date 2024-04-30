package com.pizzariafatiafeliz.pizzariaapi.controllers;

import com.pizzariafatiafeliz.pizzariaapi.models.Pedido;
import com.pizzariafatiafeliz.pizzariaapi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PedidoController {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @RequestMapping(value = "/cadpedido", method = RequestMethod.POST)
    public Pedido save() {
        Pedido p = new Pedido();
        p.setPedido("Nayara");
        p = this.pedidoRepository.save(p);
        return p;
    }

    @GetMapping("/mostrarpedido/{id}")
    public void findById(@PathVariable long id) {
        Optional<Pedido> resultado = this.pedidoRepository.findById(id);
        resultado.orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Pedido updateById(@PathVariable long id, @RequestBody Pedido pedido){
        this.findById(id);
        pedido.setId(id);
        pedido = this.pedidoRepository.save(pedido);
        return pedido;
    }


}
