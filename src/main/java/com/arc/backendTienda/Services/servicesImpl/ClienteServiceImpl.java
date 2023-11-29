package com.arc.backendTienda.Services.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arc.backendTienda.Models.Cliente;
import com.arc.backendTienda.Repositories.ClienteRepository;
import com.arc.backendTienda.Services.ClienteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findByClienteNit(id);
    }

    @Override
    public Cliente deleteClienteById(Long id) {
        Cliente cliente = clienteRepository.findByClienteNit(id);
        clienteRepository.delete(cliente);
        return cliente;
    }
}
