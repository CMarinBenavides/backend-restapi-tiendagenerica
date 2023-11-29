package com.arc.backendTienda.Services;

import com.arc.backendTienda.DTO.LoginResponse;

public interface AuthService {

    public LoginResponse attemptLogin(String username, String password);

}
