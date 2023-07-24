package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Participants;

public interface ParticipantsRepository extends JpaRepository<Participants, Long> {
    
}
