package com.example.auth.services;

import com.example.auth.dto.JwtAuthenticationResponse;
import com.example.auth.dto.RefreshTokenRequest;
import com.example.auth.dto.SignInRequest;
import com.example.auth.dto.SignUpRequest;
import com.example.auth.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
//    User signin(SignInRequest signinRequest);


    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
