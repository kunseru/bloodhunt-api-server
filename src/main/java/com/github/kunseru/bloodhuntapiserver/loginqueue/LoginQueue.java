package com.github.kunseru.bloodhuntapiserver.loginqueue;

import com.github.kunseru.bloodhuntapiserver.util.JwtGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginqueue/login/queue")
public class LoginQueue {

    @PostMapping
    public String queue(String username) {
        return "{\"estimatedTimeInSeconds\":0,\"token\":\"" + JwtGenerator.generateToken(username) +
        "\",\"ok\":true,\"retryable\":false,\"error\":null}";
    }
}
