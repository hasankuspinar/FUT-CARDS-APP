package com.example.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Team;

public interface TeamDAO extends MongoRepository<Team, String>{

	
	public Team findByName(String name);
	public List<Team> findByLeagueName(String leagueName);
	public List<Team> findAll();
	
}
