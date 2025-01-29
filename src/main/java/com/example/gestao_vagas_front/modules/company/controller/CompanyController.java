package com.example.gestao_vagas_front.modules.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.gestao_vagas_front.modules.company.dto.CreateCompanyDTO;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("company", new CreateCompanyDTO());
        return "company/create";
    }
    
}
