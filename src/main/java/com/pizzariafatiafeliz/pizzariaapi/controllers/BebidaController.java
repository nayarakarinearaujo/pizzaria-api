package com.pizzariafatiafeliz.pizzariaapi.controllers;


import com.pizzariafatiafeliz.pizzariaapi.models.Bebida;
import com.pizzariafatiafeliz.pizzariaapi.repositories.BebidaRepository;
import com.pizzariafatiafeliz.pizzariaapi.swaggerDoc.BebidaControllerOpenApi;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
//import io.swagger.v3.oas.annotations.Operation;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController implements BebidaControllerOpenApi {

    @Autowired
    private BebidaRepository bebidaRepository;

    @Operation(summary = "Método para cadastrar um novo setor.")
    @RequestMapping(value = "/criar/Bebida", method = RequestMethod.POST)
    public Bebida save(@RequestBody Bebida bebida) {
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

    @Operation(summary = "Método para mostrar a bebida cadastrada.")
    @RequestMapping(value = "/mostrar/Bebida", method = RequestMethod.GET)
    public List<Bebida> findAll() {
        List<Bebida> bebida = this.bebidaRepository.findAll();
        return bebida;
    }

    @Operation(summary = "Método para mostrar por id a bebida cadastrada.")
    @RequestMapping(value = "/mostrar/Bebida/{id}", method = RequestMethod.GET)
    public Bebida findByid(@PathVariable Long id) {
        Optional<Bebida> resultado = this.bebidaRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Bebida não encontrada");
        } else {
            return resultado.get();
        }
    }

    @Operation(summary = "Método para editar por id a bebida cadastrada.")
    @RequestMapping(value = "/editar/Bebida/{id}", method = RequestMethod.PUT)
    public Bebida editarById(@PathVariable Long id, @RequestBody Bebida bebida) {
        this.findByid(id);
        bebida.setIdBebida(id);
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

    @Operation(summary = "Método para excluir por id a bebida cadastrada.")
    @RequestMapping(value = "/excluir/Bebida/{id}", method = RequestMethod.GET)
    public Bebida deleteById(@PathVariable Long id) {
        Bebida bebida = findByid(id);
        this.bebidaRepository.deleteById(id);
        return bebida;
    }
}

