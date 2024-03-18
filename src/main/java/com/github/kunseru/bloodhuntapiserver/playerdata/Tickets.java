package com.github.kunseru.bloodhuntapiserver.playerdata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playerdata/tickets")
public class Tickets {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping
    public String get(@RequestBody String requestBody) throws JsonProcessingException {
        JsonNode rootNode = objectMapper.readTree(requestBody);
        String ticketKey = rootNode.path("ticket").asText();
        return "{\"ticket\":\"" + ticketKey + "\",\"playerId\":\"16253249311941367370\",\"sharkmobUserName\":\"Lieferando\",\"desiredRefreshIntervalMinutes\":25,\"ok\":true,\"retryable\":false,\"error\":null}";
    }
}
