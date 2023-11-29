package com.arc.backendTienda.Services.servicesImpl;

import java.util.ArrayList;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.arc.backendTienda.DTO.LoginResponse;
import com.arc.backendTienda.Models.Rol;
import com.arc.backendTienda.Security.JwtIssuer;
import com.arc.backendTienda.Security.UserPrincipal;
import com.arc.backendTienda.Services.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final JwtIssuer jwtIssuer;

    private final AuthenticationManager authenticationManager;

    @Override
    public LoginResponse attemptLogin(String username, String password) {
        var authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        var principal = (UserPrincipal) authentication.getPrincipal();

        var roles = principal.getAuthorities().stream()
                .map(authority -> ((SimpleGrantedAuthority) authority).getAuthority()).toList();

        var rolesList = new ArrayList<Rol>();
        for (String rol : roles) {
            Rol rol1 = new Rol();
            rol1.setRol_nombre(rol);
            rolesList.add(rol1);
        }

        var token = jwtIssuer.issue(principal.getUserId(), principal.getUsername(), rolesList);
        return LoginResponse.builder()
                .accessToken(token)
                .build();
    }

}
