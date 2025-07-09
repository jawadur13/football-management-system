package com.rafid.fcms.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "training_sessions")
public class TrainingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "session_date")
    private LocalDate sessionDate;

    private String location;

    @Column(name = "coach_id")
    private Long coachId;

    @Column(name = "team_id")
    private Long teamId;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public String getLocation() {
        return location;
    }

    public Long getCoachId() {
        return coachId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
