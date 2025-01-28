package com.example.gestao_vagas_front.modules.candidate.dto;

import lombok.Data;

@Data
public class CreateCandidateDTO {

    private String username;
    private String name;
    private String password;
    private String email;
    private String description;
}
