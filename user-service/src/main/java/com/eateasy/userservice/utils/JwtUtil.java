package com.eateasy.userservice.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Claims;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "your256BitSecretKeyForJWTSigning"; // Replace with a strong 256-bit key
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
    
    private static Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public static String extractUsername(String token) {
        return getClaims(token).getSubject();
    }

    public static boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }

    private static boolean isTokenExpired(String token) {
        return getClaims(token).getExpiration().before(new Date());
    }

    private static Claims getClaims(String token) {
        JwtParser parser = Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build();
        return parser.parseClaimsJws(token).getBody();
    }
}