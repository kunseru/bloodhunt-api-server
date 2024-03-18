package com.github.kunseru.bloodhuntapiserver.party;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/party/parties/")
public class Parties {

    @GetMapping("/mine")
    public String getMine() {
        return "{\"partyFound\":false,\"partyId\":null,\"players\":null,\"playerIds\":null,\"leaderIndex\":0,\"maxMembers\":3,\"hostAddr\":null,\"hostPort\":0,\"gameSessionToken\":null,\"maintenanceMode\":false,\"ok\":true,\"retryable\":false,\"error\":null}";
    }
}
