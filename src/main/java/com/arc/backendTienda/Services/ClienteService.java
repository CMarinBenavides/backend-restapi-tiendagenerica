package com.arc.backendTienda.Services;

import java.util.List;

import com.arc.backendTienda.Models.Cliente;

public interface ClienteService {

    public Cliente save(Cliente cliente);

    public List<Cliente> getAllClientes();

    public Cliente findById(Long id);

    public Cliente deleteClienteById(Long id);
}
