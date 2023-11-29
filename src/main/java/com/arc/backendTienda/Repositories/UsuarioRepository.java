package com.arc.backendTienda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.backendTienda.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsuario(String usuario);

    Usuario findByCedula(Long cedula);
}
