package com.arc.backendTienda.Services.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arc.backendTienda.Models.Proveedor;
import com.arc.backendTienda.Repositories.ProveedorRepository;
import com.arc.backendTienda.Services.ProveedorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public List<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor findById(Long id) {
        return proveedorRepository.findByNitProveedor(id);
    }

    @Override
    public Proveedor deleteProveedorById(Long id) {
        Proveedor proveedor = proveedorRepository.findByNitProveedor(id);
        proveedorRepository.delete(proveedor);
        return proveedor;
    }
}
