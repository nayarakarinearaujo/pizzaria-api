package com.pizzariafatiafeliz.pizzariaapi.repositories;

import com.pizzariafatiafeliz.pizzariaapi.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
