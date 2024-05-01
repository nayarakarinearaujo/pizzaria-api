package com.pizzariafatiafeliz.pizzariaapi.controllers;


import com.pizzariafatiafeliz.pizzariaapi.models.Bebida;
import com.pizzariafatiafeliz.pizzariaapi.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository;

    @RequestMapping(value = "/criar/Bebida", method = RequestMethod.POST)
    public Bebida save(@RequestBody Bebida bebida) {
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

    @RequestMapping(value = "/mostrar/Bebida", method = RequestMethod.GET)
    public List<Bebida> findAll() {
        List<Bebida> bebida = this.bebidaRepository.findAll();
        return bebida;
    }


    @RequestMapping(value = "/mostrar/Bebida/{id}", method = RequestMethod.GET)
    public Bebida findByid(@PathVariable Long id) {
        Optional<Bebida> resultado = this.bebidaRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Bebida não encontrada");
        } else {
            return resultado.get();
        }
    }


    @RequestMapping(value = "/editar/Bebida/{id}", method = RequestMethod.PUT)
    public Bebida editarById(@PathVariable Long id, @RequestBody Bebida bebida) {
        this.findByid(id);
        bebida.setIdBebida(id);
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }


    @RequestMapping(value = "/excluir/Bebida/{id}", method = RequestMethod.GET)
    public Bebida deleteById(@PathVariable Long id) {
        Bebida bebida = findByid(id);
        this.bebidaRepository.deleteById(id);
        return bebida;
    }
}

