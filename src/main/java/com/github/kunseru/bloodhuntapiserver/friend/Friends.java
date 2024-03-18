package com.github.kunseru.bloodhuntapiserver.friend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/friend/friends")
public class Friends {

    @GetMapping
    public String getFriends() {
        return "{\"friends\":[],\"ok\":true,\"retryable\":false,\"error\":null}";
    }
}
