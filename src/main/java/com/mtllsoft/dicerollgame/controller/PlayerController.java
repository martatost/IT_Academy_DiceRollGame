package com.mtllsoft.dicerollgame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtllsoft.dicerollgame.model.Player;
import com.mtllsoft.dicerollgame.repositories.PlayerRepository;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerRepository playerRepository;
	
	@RequestMapping ("/players")
	private List<Player> getAll(){
		return playerRepository.findAll();
	}
	
	@RequestMapping (value="/players", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	private void newPlayer(@RequestBody Player player) {
		playerRepository.save(player);
	}

}
