package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Player {
	@Id private String id;
	private String team;
	private String name;
	private String nat;
	private String pos;
	private int ovr;
	private int pac;
	private int shoot;
	private int pass;
	private int dri;
	private int def;
	private int phy;
	
	public Player()
	{
		
	}

	public Player(String team, String name, String nat, String pos, int ovr, int pac, int shoot, int pass, int dri,
			int def, int phy) {
		super();
		this.team = team;
		this.name = name;
		this.nat = nat;
		this.pos = pos;
		this.ovr = ovr;
		this.pac = pac;
		this.shoot = shoot;
		this.pass = pass;
		this.dri = dri;
		this.def = def;
		this.phy = phy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getOvr() {
		return ovr;
	}

	public void setOvr(int ovr) {
		this.ovr = ovr;
	}

	public int getPac() {
		return pac;
	}

	public void setPac(int pac) {
		this.pac = pac;
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public int getDri() {
		return dri;
	}

	public void setDri(int dri) {
		this.dri = dri;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", team=" + team + ", name=" + name + ", nat=" + nat + ", pos=" + pos + ", ovr="
				+ ovr + ", pac=" + pac + ", shoot=" + shoot + ", pass=" + pass + ", dri=" + dri + ", def=" + def
				+ ", phy=" + phy + "]";
	}

	

	

	
	
	
	
	
	
	
	
	
}
