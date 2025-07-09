package com.rafid.fcms.controller;

import com.rafid.fcms.model.Stadium;
import com.rafid.fcms.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/stadiums")
public class StadiumController {

    @Autowired
    private StadiumRepository stadiumRepository;

    // POST - create new stadium
    @PostMapping
    public Stadium createStadium(@RequestBody Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    // GET - all stadiums
    @GetMapping
    public List<Stadium> getAllStadiums() {
        return stadiumRepository.findAll();
    }

    // GET - single stadium
    @GetMapping("/{id}")
    public Optional<Stadium> getStadium(@PathVariable Long id) {
        return stadiumRepository.findById(id);
    }

    // PUT - update stadium
    @PutMapping("/{id}")
    public Stadium updateStadium(@PathVariable Long id, @RequestBody Stadium updated) {
        Stadium stadium = stadiumRepository.findById(id).orElseThrow();
        stadium.setName(updated.getName());
        stadium.setLocation(updated.getLocation());
        stadium.setCapacity(updated.getCapacity());
        return stadiumRepository.save(stadium);
    }

    // DELETE - delete stadium
    @DeleteMapping("/{id}")
    public void deleteStadium(@PathVariable Long id) {
        stadiumRepository.deleteById(id);
    }
}
