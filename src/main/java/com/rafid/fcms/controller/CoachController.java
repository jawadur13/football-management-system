package com.rafid.fcms.controller;

import com.rafid.fcms.model.Coach;
import com.rafid.fcms.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/coaches")
public class CoachController {

    @Autowired
    private CoachRepository coachRepository;

    // POST - Add new coach
    @PostMapping
    public Coach addCoach(@RequestBody Coach coach) {
        return coachRepository.save(coach);
    }

    // GET - Get all coaches
    @GetMapping
    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    // GET - Get coach by ID
    @GetMapping("/{id}")
    public Optional<Coach> getCoachById(@PathVariable Long id) {
        return coachRepository.findById(id);
    }

    // PUT - Update coach
    @PutMapping("/{id}")
    public Coach updateCoach(@PathVariable Long id, @RequestBody Coach updatedCoach) {
        Coach coach = coachRepository.findById(id).orElseThrow();
        coach.setName(updatedCoach.getName());
        coach.setRole(updatedCoach.getRole());
        coach.setTeamId(updatedCoach.getTeamId());
        return coachRepository.save(coach);
    }

    // DELETE - Remove coach
    @DeleteMapping("/{id}")
    public void deleteCoach(@PathVariable Long id) {
        coachRepository.deleteById(id);
    }
}
