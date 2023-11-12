package com.example.email_sender_api.controller;

import com.example.email_sender_api.domain.dto.EmailDTO;
import com.example.email_sender_api.service.EmailServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/email")
@RestController
public class EmailController {

    private final EmailServiceImpl emailService;

    @Autowired
    public EmailController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<Void> doSendEmail(@RequestBody @Valid EmailDTO dto) {
        System.out.println("DTO:" + dto);
        emailService.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }
}
