package com.rafid.fcms.controller;

import com.rafid.fcms.model.Team;
import com.rafid.fcms.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    // POST - Create new team
    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    // GET - Get all teams
    @GetMapping
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    // GET - Get single team
    @GetMapping("/{id}")
    public Optional<Team> getTeamById(@PathVariable Long id) {
        return teamRepository.findById(id);
    }

    // PUT - Update team
    @PutMapping("/{id}")
    public Team updateTeam(@PathVariable Long id, @RequestBody Team updatedTeam) {
        Team team = teamRepository.findById(id).orElseThrow();
        team.setName(updatedTeam.getName());
        team.setManagerName(updatedTeam.getManagerName());
        team.setLeague(updatedTeam.getLeague());
        return teamRepository.save(team);
    }

    // DELETE - Delete team
    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamRepository.deleteById(id);
    }
}
