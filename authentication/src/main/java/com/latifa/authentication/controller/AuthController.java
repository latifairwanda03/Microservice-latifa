package com.latifa.authentication.controller;

import com.latifa.authentication.dto.AuthRequest;
import com.latifa.authentication.dto.AuthResponse;
import com.latifa.authentication.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
    
    // Contoh endpoint yang diproteksi JWT
    @GetMapping("/test-auth")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Halo! Jika kamu melihat pesan ini, berarti Token JWT kamu valid.");
    }
}