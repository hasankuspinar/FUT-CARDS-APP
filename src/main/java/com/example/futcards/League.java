package com.example.futcards;


import java.util.List;

public class League {

        private String id;
        private String name;

        //private List<Team> teamList;

        public League() {

        }

        public League(String id,String name) {
            super();
            this.id = id;
            this.name = name;
            //this.teamList = teamList;
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
        public List<Team> getTeamList() {
            return teamList;
        }

        public void setTeamList(List<Team> teamList) {
            this.teamList = teamList;
        }
*/
        @Override
        public String toString() {
            return "League [id=" + id + ", name=" + name + ", teamList=" + "]";
        }




    }

