package com.github.kunseru.bloodhuntapiserver.legal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legal/versions.json")
public class LegalVersions {

    @GetMapping
    public String getLegalVersions() {
        return "{\"Eula\":\"2023.04.25-07.49.56\",\"ExportGate\":\"2023.04.25-07.49.56\",\"ExportGateDenied\":\"2023.04.25-07.49.56\",\"KoreaSpecial1\":\"2023.04.25-07.49.56\",\"KoreaSpecial2\":\"2023.04.25-07.49.56\",\"KoreaSpecial3\":\"2023.04.25-07.49.56\",\"KoreaSpecial4\":\"2023.04.25-07.49.56\",\"KoreaSpecial5\":\"2023.04.25-07.49.56\",\"Newsletter\":\"2023.04.25-07.49.56\",\"NewsletterKorea\":\"2023.04.25-07.49.56\",\"PrivacyPolicy\":\"2023.04.25-07.49.56\"}";
    }
}
