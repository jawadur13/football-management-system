package com.rafid.fcms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "manager_name")
    private String managerName;

    private String league;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getLeague() {
        return league;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setLeague(String league) {
        this.league = league;
    }
}
