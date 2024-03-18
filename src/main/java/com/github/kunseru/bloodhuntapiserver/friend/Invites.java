package com.github.kunseru.bloodhuntapiserver.friend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/friend/invites")
public class Invites {

    @GetMapping
    public String getInvites() {
        return "{\"invites\":[],\"ok\":true,\"retryable\":false,\"error\":null}";
    }
}
