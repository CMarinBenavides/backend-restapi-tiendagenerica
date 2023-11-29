package com.arc.backendTienda.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    @Id
    private Long rol_id;

    private String rol_nombre;

    /**
     * @return String return the rol_nombre
     */
    public String getRol_nombre() {
        return rol_nombre;
    }

    /**
     * @param rol_nombre the rol_nombre to set
     */
    public void setRol_nombre(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }

    /**
     * @return Long return the rol_id
     */
    public Long getRol_id() {
        return rol_id;
    }

    /**
     * @param rol_id the rol_id to set
     */
    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }

}
