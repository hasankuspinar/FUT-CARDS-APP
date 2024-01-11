package com.example.futcards;

import java.util.List;

public class Team {
    private String id;
    private String name;
    private String leagueName;

    //private List<Player> playerList;

    public Team() {

    }
    public Team(String id,String name, String leagueName) {
        super();
        this.id = id;
        this.name = name;
        this.setLeagueName(leagueName);
        //this.playerList = playerList;
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
/*
    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
*/
    @Override
    public String toString() {
        return "Team [id=" + id + ", name=" + name + ", playerList=" + "]";
    }


    public String getLeagueName() {
        return leagueName;
    }


    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }


}
