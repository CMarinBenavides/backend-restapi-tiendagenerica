package com.arc.backendTienda.Security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.arc.backendTienda.Services.UsuarioService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var usuario = usuarioService.findByUsername(username);
        List<SimpleGrantedAuthority> authorities = usuario.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRol_nombre())).collect(Collectors.toList());
        System.out.println("authorities: " + authorities);
        return UserPrincipal.builder()
                .userId(usuario.getCedula())
                .username(usuario.getUsuario())
                .authorities(authorities)
                .password(usuario.getClave())
                .build();
    }

}
