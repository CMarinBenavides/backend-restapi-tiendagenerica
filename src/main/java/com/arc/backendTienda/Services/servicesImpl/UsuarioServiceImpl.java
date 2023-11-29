package com.arc.backendTienda.Services.servicesImpl;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.arc.backendTienda.Models.Rol;
import com.arc.backendTienda.Models.Usuario;
import com.arc.backendTienda.Repositories.RolRepository;
import com.arc.backendTienda.Repositories.UsuarioRepository;
import com.arc.backendTienda.Services.UsuarioService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    private final RolRepository rolRepository;

    @Override
    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsuario(username);
    }

    @Override
    public List<Rol> getAllRoles() {
        List<Rol> rolesSinAdmin = rolRepository.findAll();
        rolesSinAdmin.remove(0);
        return rolesSinAdmin;
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuario.setClave(new BCryptPasswordEncoder().encode(usuario.getClave()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        Rol rolAdmin = rolRepository.findById(1L).get();
        List<Usuario> usuariosSinAdmin = usuarios.stream().filter(usuario -> !usuario.getRoles().contains(rolAdmin))
                .toList();
        return usuariosSinAdmin;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findByCedula(id);
    }

    @Override
    public Usuario deleteUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findByCedula(id);
        usuarioRepository.delete(usuario);
        return usuario;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        usuario.setClave(new BCryptPasswordEncoder().encode(usuario.getClave()));
        return usuarioRepository.save(usuario);
    }

}
