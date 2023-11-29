package com.arc.backendTienda.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.backendTienda.Models.Producto;
import com.arc.backendTienda.Models.Proveedor;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByProveedor(Proveedor proveedor);

}
