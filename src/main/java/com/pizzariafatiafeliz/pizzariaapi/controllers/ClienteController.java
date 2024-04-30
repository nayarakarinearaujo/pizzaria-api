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

    public ClienteController(ClienteRepository clienteRepositorynteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @RequestMapping(value = "/cadcliente", method = RequestMethod.POST)
    public Cliente save() {
        Cliente u = new Cliente();
        u.setNome("Nayara");
        u = this.clienteRepository.save(u);
        return u;
    }


    @RequestMapping(value = "/mostrarcliente", method = RequestMethod.GET)
    public List<Cliente> findAll() {
        List<Cliente> cliente = this.clienteRepository.findAll();
        return cliente;
    }

    @RequestMapping(value = "/mostrarcliente/{id}", method = RequestMethod.GET)
    public Cliente findById(@PathVariable long id) {
        Optional<Cliente> resultado = this.clienteRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Usuario não encontrado");
        } else {
            return resultado.get();
        }
    }

    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
    public Cliente deletebyId(@PathVariable long id) {
        Cliente cliente = findById(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }


    @RequestMapping(value = "/editar", method = RequestMethod.PUT)
    public Cliente updateById( @RequestBody Cliente usuario){
        this.findById(usuario.getId());
        usuario.setId(usuario.getId());
        usuario = this.clienteRepository.save(usuario);
        return usuario;
    }
}
