package com.arc.backendTienda.Security;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arc.backendTienda.Models.Rol;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtIssuer {

    private final JwtProperties jwtProperties;

    public String issue(long userId, String username, List<Rol> roles) {
        return JWT.create()
                .withSubject(String.valueOf(userId))
                .withExpiresAt(Instant.now().plus(1, ChronoUnit.DAYS))
                .withClaim("username", username)
                .withArrayClaim("roles", roles.stream().map(Rol::getRol_nombre).toArray(String[]::new))
                .sign(Algorithm.HMAC512(jwtProperties.getSecretKey()));
    }
}
