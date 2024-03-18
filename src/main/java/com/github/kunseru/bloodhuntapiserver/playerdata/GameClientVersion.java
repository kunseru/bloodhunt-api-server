package com.github.kunseru.bloodhuntapiserver.playerdata;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playerdata/gameClientVersion/{version}")
public class GameClientVersion {

    @GetMapping
    public String validateVersion(@PathVariable String version, HttpServletRequest request) {
        return "{\"versionIsValid\":true,\"publicIpv4\":\"" + request.getRemoteAddr() + "\",\"publicIpv6\":\"" + getIPv6Address(request) + "\",\"ok\":true,\"retryable\":false,\"error\":null}";
    }

    private String getIPv6Address(HttpServletRequest request) {
        String ipv6Address = request.getHeader("X-Forwarded-For");
        if (ipv6Address != null && ipv6Address.contains(":")) {
            ipv6Address = ipv6Address.split(",")[0].trim();
            ipv6Address = "[" + ipv6Address + "]";
        }
        return ipv6Address;
    }
}
