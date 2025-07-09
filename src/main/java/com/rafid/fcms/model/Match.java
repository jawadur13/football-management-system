package com.rafid.fcms.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String opponent;

    @Column(name = "match_date")
    private LocalDate matchDate;

    private String result;

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "stadium_id")
    private Long stadiumId;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getOpponent() {
        return opponent;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public String getResult() {
        return result;
    }

    public Long getTeamId() {
        return teamId;
    }

    public Long getStadiumId() {
        return stadiumId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public void setStadiumId(Long stadiumId) {
        this.stadiumId = stadiumId;
    }
}
