package com.example.gestao_vagas_front.modules.company.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.gestao_vagas_front.modules.company.dto.CreateJobsDTO;

@Service
public class CreateJobService {

    @Value("${server.api.url}")
    private String serverApiUrl;
    
    public String execute(CreateJobsDTO jobs, String token) {
        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        HttpEntity<CreateJobsDTO> request = new HttpEntity<>(jobs, headers);

        var url = serverApiUrl.concat("/company/job/");

        var result = rt.postForObject(url, request, String.class);
        
        return result;  
    }
}
