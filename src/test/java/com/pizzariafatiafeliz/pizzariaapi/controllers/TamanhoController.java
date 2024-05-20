package com.pizzariafatiafeliz.pizzariaapi.controllers;

import com.pizzariafatiafeliz.pizzariaapi.models.Tamanho;
import com.pizzariafatiafeliz.pizzariaapi.repositories.TamanhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TamanhoController {

    @Autowired
    private TamanhoRepository tamanhoRepository;


    @RequestMapping(value = "/criarTamanho", method = RequestMethod.POST)
    public Tamanho save(@RequestBody Tamanho tamanho) {
        tamanho = this.tamanhoRepository.save(tamanho);
        return tamanho;
    }

    @RequestMapping(value = "/mostrarTamanho",method = RequestMethod.GET )
    public List<Tamanho> findAll(){
        List<Tamanho> tamanho = this.tamanhoRepository.findAll();
        return tamanho;
    }


    @RequestMapping(value = "/mostrarTamanho/{id}",method = RequestMethod.GET )
    public Tamanho findByid(@PathVariable Long id)    {
        Optional<Tamanho> resultado = this.tamanhoRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Tamanho nao encontrado");}
        else
        { return resultado.get();}
    }


    @RequestMapping(value = "/editarTamanho/{id}", method = RequestMethod.PUT)
    public Tamanho editarById(@PathVariable Long id, @RequestBody Tamanho tamanho)    {
        this.findByid(id);
        tamanho.setIdTamanho(id);
        tamanho = this.tamanhoRepository.save(tamanho);
        return tamanho;
    }


    @RequestMapping(value = "/excluirTamanho/{id}", method = RequestMethod.GET)
    public Tamanho deleteById(@PathVariable Long id)    {
        Tamanho tamanho =  findByid(id);
        this.tamanhoRepository.deleteById(id);
        return tamanho;
    }

}


