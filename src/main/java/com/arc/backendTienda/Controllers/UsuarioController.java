package com.arc.backendTienda.Controllers;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arc.backendTienda.Models.Rol;
import com.arc.backendTienda.Models.Usuario;
import com.arc.backendTienda.Security.UserPrincipal;
import com.arc.backendTienda.Services.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario getUsuario(@AuthenticationPrincipal UserPrincipal userPrincipal, @RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping("/rol")
    public List<Rol> getAllRoles(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return usuarioService.getAllRoles();
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/usuario")
    public Usuario getUsuarioByUsername(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return usuarioService.findByUsername(userPrincipal.getUsername());
    }

    @GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable(value = "id") Long id) {
        return usuarioService.findById(id);
    }

    @DeleteMapping("/usuario/{id}")
    public void deleteUsuarioById(@AuthenticationPrincipal UserPrincipal userPrincipal,
            @PathVariable(value = "id") Long id) {
        usuarioService.deleteUsuarioById(id);
    }
}
