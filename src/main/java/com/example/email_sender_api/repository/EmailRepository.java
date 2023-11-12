package com.example.email_sender_api.repository;

import com.example.email_sender_api.domain.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, String> {

}
