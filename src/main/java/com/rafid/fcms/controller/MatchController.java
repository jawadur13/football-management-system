package com.rafid.fcms.controller;

import com.rafid.fcms.model.Match;
import com.rafid.fcms.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;

    // POST: Add new match
    @PostMapping
    public Match addMatch(@RequestBody Match match) {
        return matchRepository.save(match);
    }

    // GET: All matches
    @GetMapping
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    // GET: One match
    @GetMapping("/{id}")
    public Optional<Match> getMatch(@PathVariable Long id) {
        return matchRepository.findById(id);
    }

    // PUT: Update match
    @PutMapping("/{id}")
    public Match updateMatch(@PathVariable Long id, @RequestBody Match updated) {
        Match match = matchRepository.findById(id).orElseThrow();
        match.setOpponent(updated.getOpponent());
        match.setMatchDate(updated.getMatchDate());
        match.setResult(updated.getResult());
        match.setTeamId(updated.getTeamId());
        match.setStadiumId(updated.getStadiumId());
        return matchRepository.save(match);
    }

    // DELETE: Remove match
    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable Long id) {
        matchRepository.deleteById(id);
    }
}
