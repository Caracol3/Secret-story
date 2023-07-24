package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Participants;
import com.example.demo.repository.ParticipantsRepository;

@RestController
public class ParticipantsController {
    @Autowired ParticipantsRepository participantsRepository;

    @GetMapping("/participants")
    public List<Participants> getAllParticipants() {
        return participantsRepository.findAll();
    }

    @PostMapping("/participant")
    public Participants createParticipants(@RequestBody Participants participants) {
        return participantsRepository.save(participants);
    }

}
