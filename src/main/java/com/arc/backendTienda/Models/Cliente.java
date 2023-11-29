package com.arc.backendTienda.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    private Long clienteNit;

    private String cliente_nombre;

    private String cliente_direccion;

    private String cliente_telefono;

    private String cliente_ciudad;

    /**
     * @return Long return the clienteNit
     */
    public Long getClienteNit() {
        return clienteNit;
    }

    /**
     * @param clienteNit the clienteNit to set
     */
    public void setClienteNit(Long clienteNit) {
        this.clienteNit = clienteNit;
    }

    /**
     * @return String return the cliente_nombre
     */
    public String getCliente_nombre() {
        return cliente_nombre;
    }

    /**
     * @param cliente_nombre the cliente_nombre to set
     */
    public void setCliente_nombre(String cliente_nombre) {
        this.cliente_nombre = cliente_nombre;
    }

    /**
     * @return String return the cliente_direccion
     */
    public String getCliente_direccion() {
        return cliente_direccion;
    }

    /**
     * @param cliente_direccion the cliente_direccion to set
     */
    public void setCliente_direccion(String cliente_direccion) {
        this.cliente_direccion = cliente_direccion;
    }

    /**
     * @return String return the cliente_telefono
     */
    public String getCliente_telefono() {
        return cliente_telefono;
    }

    /**
     * @param cliente_telefono the cliente_telefono to set
     */
    public void setCliente_telefono(String cliente_telefono) {
        this.cliente_telefono = cliente_telefono;
    }

    /**
     * @return String return the cliente_ciudad
     */
    public String getCliente_ciudad() {
        return cliente_ciudad;
    }

    /**
     * @param cliente_ciudad the cliente_ciudad to set
     */
    public void setCliente_ciudad(String cliente_ciudad) {
        this.cliente_ciudad = cliente_ciudad;
    }

}
