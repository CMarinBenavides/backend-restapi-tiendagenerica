package com.arc.backendTienda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.backendTienda.Models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    Proveedor findByNitProveedor(Long nitProveedor);
}
