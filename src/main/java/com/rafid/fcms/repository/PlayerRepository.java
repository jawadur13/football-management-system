package com.rafid.fcms.repository;

import com.rafid.fcms.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // No need to write any code — CRUD is auto-managed
}
