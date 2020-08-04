package com.cg.beans;

public class Team {
private String name;
private Player player;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Player getPlayer() {
	return player;
}
public void setPlayer(Player player) {
	this.player = player;
}

public Team() {
	super();
	// TODO Auto-generated constructor stub
}

public Team(String name, Player player) {
	super();
	this.name = name;
	this.player = player;
}
@Override
public String toString() {
	return "Team [name=" + name + ", player=" + player + "]";
}

}
