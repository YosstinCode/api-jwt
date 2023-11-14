package com.depgirpro.securitytokenlogin.controller;

import com.depgirpro.securitytokenlogin.dto.LoginRequestDTO;
import com.depgirpro.securitytokenlogin.model.Persona;
import com.depgirpro.securitytokenlogin.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login")
public class LoginController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<Persona> login(@RequestBody LoginRequestDTO datos){

        return ResponseEntity.ok(authenticationService.login(datos));

    }
}
