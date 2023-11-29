package com.arc.backendTienda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.backendTienda.Models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByClienteNit(Long clienteNit);
}
