package com.arc.backendTienda.Controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arc.backendTienda.Models.Cliente;
import com.arc.backendTienda.Security.UserPrincipal;
import com.arc.backendTienda.Services.ClienteService;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/cliente")
    public Cliente getCliente(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> getAllClientes(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return clienteService.getAllClientes();
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable(value = "id") Long id) {
        return clienteService.findById(id);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteClienteById(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable(value = "id") Long id) {
        clienteService.deleteClienteById(id);
    }

    @PutMapping("/cliente")
    public Cliente updateCliente(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @RequestBody Cliente cliente) {
        return clienteService.updateCliente(cliente);
    }
}
