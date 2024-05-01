package com.pizzariafatiafeliz.pizzariaapi.controllers;

import com.pizzariafatiafeliz.pizzariaapi.models.Cliente;
import com.pizzariafatiafeliz.pizzariaapi.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;


    @RequestMapping(value = "/criar/Cliente", method = RequestMethod.POST)
    public Cliente save(@RequestBody Cliente cliente) {
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }


    @RequestMapping(value = "/mostrar/Cliente", method = RequestMethod.GET)
    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }

    @RequestMapping(value = "/mostrar/Cliente/{id}", method = RequestMethod.GET)
    public Cliente findById(@PathVariable Long id) {
        Optional<Cliente> resultado = this.clienteRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado");
        } else {
            return resultado.get();
        }
    }


    @RequestMapping(value = "cliente/editar/{id}", method = RequestMethod.PUT)
    public Cliente editarById(@PathVariable Long id, @RequestBody Cliente cliente)    {
        this.findById(id);
        cliente.setIdCliente(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }


    @RequestMapping(value = "/excluir/Cliente/{id}", method = RequestMethod.GET)
    public Cliente deletebyId(@PathVariable Long id) {
        Cliente cliente = findById(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }
}
