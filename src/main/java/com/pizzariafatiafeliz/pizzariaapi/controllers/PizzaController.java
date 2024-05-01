package com.pizzariafatiafeliz.pizzariaapi.controllers;

import com.pizzariafatiafeliz.pizzariaapi.models.Pizza;
import com.pizzariafatiafeliz.pizzariaapi.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @RequestMapping(value = "/criarPizza",method = RequestMethod.POST)
    public Pizza save(@RequestBody Pizza pizza)
    {
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }

    @RequestMapping(value = "/mostrarPizza",method = RequestMethod.GET )
    public List<Pizza> findAll(){
        List<Pizza> pizza = this.pizzaRepository.findAll();
        return pizza;
    }


    @RequestMapping(value = "/mostrarPizza/{id}",method = RequestMethod.GET )
    public Pizza findByid(@PathVariable long id)    {
        Optional<Pizza> resultado = this.pizzaRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Pizza não encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "Pizza/excluir/{id}", method = RequestMethod.GET)
    public Pizza deleteById(@PathVariable long id)    {
        Pizza Pizza =  findByid(id);
        this.pizzaRepository.deleteById(id);
        return Pizza;
    }

    @RequestMapping(value = "Pizza/editar/{id}", method = RequestMethod.PUT)
    public Pizza editarById(@PathVariable long id, @RequestBody Pizza pizza)    {
        this.findByid(id);
        pizza.setIdPizza(id);
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }
}