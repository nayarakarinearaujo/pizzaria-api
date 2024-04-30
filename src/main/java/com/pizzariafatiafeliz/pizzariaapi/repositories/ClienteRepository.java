package com.pizzariafatiafeliz.pizzariaapi.repositories;

import com.pizzariafatiafeliz.pizzariaapi.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
