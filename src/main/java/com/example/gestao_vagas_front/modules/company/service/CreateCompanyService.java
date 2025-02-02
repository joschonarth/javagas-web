package com.example.gestao_vagas_front.modules.company.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.gestao_vagas_front.modules.company.dto.CreateCompanyDTO;

@Service
public class CreateCompanyService {

    @Value("${server.api.url}")
    private String serverApiUrl;
    
    public String execute(CreateCompanyDTO createCompanyDTO) {
        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CreateCompanyDTO> request = new HttpEntity<>(createCompanyDTO, headers);

        var url = serverApiUrl.concat("/company/");

        return rt.postForObject(url, request, String.class);
    }
}
