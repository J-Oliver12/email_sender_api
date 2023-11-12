package com.example.email_sender_api.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmailDTO {

    @NotBlank(message = "To fields cannot be blank")
    @Email(message = "To field must be a valid email address")
    private  String to;

    @NotBlank(message = "Subject field cannot be blank")
    private String subject;

    @NotBlank(message = "HTML field cannot be blank")
    private String html;

    @Positive(message = "Type should be a positive number")
    private Integer type;
}
