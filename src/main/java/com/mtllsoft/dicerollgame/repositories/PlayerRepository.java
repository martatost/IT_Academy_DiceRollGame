package com.mtllsoft.dicerollgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtllsoft.dicerollgame.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}