package com.rafid.fcms.controller;

import com.rafid.fcms.model.TrainingSession;
import com.rafid.fcms.repository.TrainingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/training-sessions")
public class TrainingSessionController {

    @Autowired
    private TrainingSessionRepository trainingSessionRepository;

    // Create
    @PostMapping
    public TrainingSession createSession(@RequestBody TrainingSession session) {
        return trainingSessionRepository.save(session);
    }

    // Read all
    @GetMapping
    public List<TrainingSession> getAllSessions() {
        return trainingSessionRepository.findAll();
    }

    // Read one
    @GetMapping("/{id}")
    public Optional<TrainingSession> getSession(@PathVariable Long id) {
        return trainingSessionRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public TrainingSession updateSession(@PathVariable Long id, @RequestBody TrainingSession updated) {
        TrainingSession session = trainingSessionRepository.findById(id).orElseThrow();
        session.setSessionDate(updated.getSessionDate());
        session.setLocation(updated.getLocation());
        session.setCoachId(updated.getCoachId());
        session.setTeamId(updated.getTeamId());
        return trainingSessionRepository.save(session);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Long id) {
        trainingSessionRepository.deleteById(id);
    }
}
