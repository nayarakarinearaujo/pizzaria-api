package com.pizzariafatiafeliz.pizzariaapi.repositories;

import com.pizzariafatiafeliz.pizzariaapi.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
