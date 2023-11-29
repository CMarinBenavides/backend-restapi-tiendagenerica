package com.arc.backendTienda.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    private Long producto_codigo;

    private String producto_nombre;

    @ManyToOne
    @JoinColumn(name = "nit_proveedor")
    private Proveedor proveedor;

    private Double precio_compra;

    private Double iva_compra;

    private Double precio_venta;

    /**
     * @return Long return the producto_codigo
     */
    public Long getProducto_codigo() {
        return producto_codigo;
    }

    /**
     * @param producto_codigo the producto_codigo to set
     */
    public void setProducto_codigo(Long producto_codigo) {
        this.producto_codigo = producto_codigo;
    }

    /**
     * @return String return the producto_nombre
     */
    public String getProducto_nombre() {
        return producto_nombre;
    }

    /**
     * @param producto_nombre the producto_nombre to set
     */
    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    /**
     * @return Proveedor return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return Double return the precio_compra
     */
    public Double getPrecio_compra() {
        return precio_compra;
    }

    /**
     * @param precio_compra the precio_compra to set
     */
    public void setPrecio_compra(Double precio_compra) {
        this.precio_compra = precio_compra;
    }

    /**
     * @return Double return the iva_compra
     */
    public Double getIva_compra() {
        return iva_compra;
    }

    /**
     * @param iva_compra the iva_compra to set
     */
    public void setIva_compra(Double iva_compra) {
        this.iva_compra = iva_compra;
    }

    /**
     * @return Double return the precio_venta
     */
    public Double getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }

}
