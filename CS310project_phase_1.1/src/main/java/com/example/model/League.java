package com.example.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class League {

	@Id private String id;
	private String name;
	@DBRef
	private List<Team> teamList;
	
	public League() {
		
	}

	public League(String name, List<Team> teamList) {
		super();
		this.name = name;
		this.teamList = teamList;
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

	public List<Team> getTeamList() {
		return teamList;
	}

	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}

	@Override
	public String toString() {
		return "League [id=" + id + ", name=" + name + ", teamList=" + teamList + "]";
	}

	
	
	
}
