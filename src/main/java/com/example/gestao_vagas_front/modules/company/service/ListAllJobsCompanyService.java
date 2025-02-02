package com.example.gestao_vagas_front.modules.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.gestao_vagas_front.modules.candidate.dto.JobDTO;

@Service
public class ListAllJobsCompanyService {

    @Value("${server.api.url}")
    private String serverApiUrl;
    
    public List<JobDTO> execute(String token) {
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        HttpEntity<Object> httpEntity = new HttpEntity<>(headers);

        ParameterizedTypeReference<List<JobDTO>> responseType = new ParameterizedTypeReference<List<JobDTO>>() {
        };

        var url = serverApiUrl.concat("/company/job/");

        var result = rt.exchange(url, HttpMethod.GET, httpEntity, responseType);
        return result.getBody();
    }
}
