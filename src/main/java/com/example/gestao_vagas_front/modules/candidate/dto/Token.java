package com.example.gestao_vagas_front.modules.candidate.dto;

import java.util.List;

import lombok.Data;

@Data
public class Token {

    private String access_token;
    private List<String> roles;
    private Long expires_in;
}
