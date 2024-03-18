package com.github.kunseru.bloodhuntapiserver.util;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtGenerator {

    public static String generateToken(String username) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        return Jwts.builder()
                .setSubject(username)
                .claim("can_login_at_time", now)
                .setIssuedAt(now)
                .setExpiration(new Date(nowMillis + 1710774459)) // expires in seconds
                .setIssuer("LoginQueueServiceIss")
                .setAudience("PlayerDataServerAud")
                .signWith(SignatureAlgorithm.HS256, "bloodhunt-never-dies")
                .compact();
    }
}
