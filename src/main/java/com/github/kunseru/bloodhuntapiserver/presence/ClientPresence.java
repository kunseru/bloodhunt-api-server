package com.github.kunseru.bloodhuntapiserver.presence;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/presence/clientpresence")
public class ClientPresence {

    @PostMapping
    public String getClientPresence() {
        return "{\"resendData\":false,\"ok\":true,\"retryable\":false,\"error\":null}";
    }
}
