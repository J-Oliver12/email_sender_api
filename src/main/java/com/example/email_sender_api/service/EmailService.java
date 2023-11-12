package com.example.email_sender_api.service;

import com.example.email_sender_api.domain.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);


}
