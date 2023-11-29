package com.arc.backendTienda.Services;

import java.util.List;

import com.arc.backendTienda.Models.Proveedor;

public interface ProveedorService {

    public Proveedor save(Proveedor proveedor);

    public List<Proveedor> getAllProveedores();

    public Proveedor findById(Long id);

    public Proveedor deleteProveedorById(Long id);
}
