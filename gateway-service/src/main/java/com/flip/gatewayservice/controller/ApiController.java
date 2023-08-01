package com.flip.gatewayservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class ApiController {

    @Value("${api.version}")
    public String apiVersion;

    @GetMapping
    public ResponseEntity<?> getApiVersion() {
        return ok(apiVersion);
    }
}