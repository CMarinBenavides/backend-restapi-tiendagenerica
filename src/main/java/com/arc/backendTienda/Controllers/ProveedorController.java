package com.arc.backendTienda.Controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arc.backendTienda.Models.Proveedor;
import com.arc.backendTienda.Security.UserPrincipal;
import com.arc.backendTienda.Services.ProveedorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ProveedorController {

    private final ProveedorService proveedorService;

    @PostMapping("/proveedor")
    public Proveedor getProveedor(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @RequestBody Proveedor proveedor) {
        return proveedorService.save(proveedor);
    }

    @GetMapping("/proveedores")
    public Iterable<Proveedor> getAllProveedores(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return proveedorService.getAllProveedores();
    }

    @GetMapping("/proveedor/{id}")
    public Proveedor getProveedorById(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable(value = "id") Long id) {
        return proveedorService.findById(id);
    }

    @DeleteMapping("/proveedor/{id}")
    public void deleteProveedorById(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable(value = "id") Long id) {
        proveedorService.deleteProveedorById(id);
    }

}
