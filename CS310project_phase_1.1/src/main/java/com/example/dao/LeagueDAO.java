package com.example.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.League;

public interface LeagueDAO extends MongoRepository<League, String>{
	
	
	public League findByName(String name);
	public List<League> findAll();

}
