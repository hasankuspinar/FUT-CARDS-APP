package com.example.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Team {
	
	@Id private String id;
	private String name;
	private String leagueName;
	@DBRef 
	private List<Player> playerList;
	
	public Team() {
	
	}


	public Team(String name, String leagueName, List<Player> playerList) {
		super();
		this.name = name;
		this.setLeagueName(leagueName);
		this.playerList = playerList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", playerList=" + playerList + "]";
	}


	public String getLeagueName() {
		return leagueName;
	}


	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	
	

}
