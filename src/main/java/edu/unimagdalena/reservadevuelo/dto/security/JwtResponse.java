package edu.unimagdalena.reservadevuelo.dto.security;

import java.util.List;

public record JwtResponse(String token, String type, String username, List<String> roles) {
}