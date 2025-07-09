package com.rafid.fcms.controller;

import com.rafid.fcms.model.Player;
import com.rafid.fcms.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    // Create
    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    // Read all
    @GetMapping
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    // Read one
    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    // Update
    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody Player updatedPlayer) {
        return playerRepository.findById(id)
                .map(player -> {
                    player.setName(updatedPlayer.getName());
                    player.setPosition(updatedPlayer.getPosition());
                    player.setJerseyNumber(updatedPlayer.getJerseyNumber());
                    player.setNationality(updatedPlayer.getNationality());
                    player.setAge(updatedPlayer.getAge());
                    return playerRepository.save(player);
                })
                .orElse(null);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerRepository.deleteById(id);
    }
}
