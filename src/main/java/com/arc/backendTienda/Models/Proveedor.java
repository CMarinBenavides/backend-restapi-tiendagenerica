package com.arc.backendTienda.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {

    @Id
    private Long nitProveedor;

    private String nombre_proveedor;

    private String direccion_proveedor;

    private String telefono_proveedor;

    private String ciudad_proveedor;

    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos;

    /**
     * @return Long return the nitProveedor
     */
    public Long getNitProveedor() {
        return nitProveedor;

    }

    /**
     * @param nitProveedor the nitProveedor to set
     */

    public void setNitProveedor(Long nitProveedor) {
        this.nitProveedor = nitProveedor;

    }

    /**
     * @return String return the nombre_proveedor
     */
    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    /**
     * @param nombre_proveedor the nombre_proveedor to set
     */
    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    /**
     * @return String return the direccion_proveedor
     */
    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    /**
     * @param direccion_proveedor the direccion_proveedor to set
     */
    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    /**
     * @return String return the telefono_proveedor
     */
    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    /**
     * @param telefono_proveedor the telefono_proveedor to set
     */
    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    /**
     * @return String return the ciudad_proveedor
     */
    public String getCiudad_proveedor() {
        return ciudad_proveedor;
    }

    /**
     * @param ciudad_proveedor the ciudad_proveedor to set
     */
    public void setCiudad_proveedor(String ciudad_proveedor) {
        this.ciudad_proveedor = ciudad_proveedor;
    }

    /**
     * @return List<Producto> return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
