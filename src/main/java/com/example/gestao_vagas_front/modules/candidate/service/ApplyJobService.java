package com.example.gestao_vagas_front.modules.candidate.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApplyJobService {

    @Value("${server.api.url}")
    private String serverApiUrl;

    public String execute(String token, UUID idJob) {
       RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        HttpEntity<UUID> request = new HttpEntity<>(idJob, headers);

        var url = serverApiUrl.concat("/candidate/job/apply");

        var result = rt.postForObject(url, request, String.class);
        
        return result; 
    }
    
}
