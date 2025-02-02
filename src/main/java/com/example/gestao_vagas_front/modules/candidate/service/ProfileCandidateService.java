package com.example.gestao_vagas_front.modules.candidate.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

import com.example.gestao_vagas_front.modules.candidate.dto.ProfileUserDTO;

@Service
public class ProfileCandidateService {

    @Value("${server.api.url}")
    private String serverApiUrl;

    public ProfileUserDTO execute(String token) {
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(headers);

        var url = serverApiUrl.concat("/candidate/");

        try {
            var result = rt.exchange(url, HttpMethod.GET, request, ProfileUserDTO.class);
            return result.getBody();
        } catch (Unauthorized ex) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
        }
    }
    
}
