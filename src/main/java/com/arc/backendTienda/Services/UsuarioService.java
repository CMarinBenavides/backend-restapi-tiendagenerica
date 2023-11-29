package com.arc.backendTienda.Services;

import java.util.List;

import com.arc.backendTienda.Models.Rol;
import com.arc.backendTienda.Models.Usuario;

public interface UsuarioService {

    public Usuario findByUsername(String username);

    public List<Rol> getAllRoles();

    public Usuario save(Usuario usuario);

    public List<Usuario> getAllUsuarios();

    public Usuario findById(Long id);

    public Usuario deleteUsuarioById(Long id);

    public Usuario updateUsuario(Usuario usuario);
}
