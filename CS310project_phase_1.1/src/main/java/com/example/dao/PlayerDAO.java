package com.example.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Player;

public interface PlayerDAO extends MongoRepository<Player, String>{
	
	public Player findByName(String name);
	public List<Player> findByTeam(String team);
	public List<Player> findAll();
}
