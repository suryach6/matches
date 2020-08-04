package com.cg.service;

import com.cg.beans.Player;

public class PlayerBo {
public Player createPlayer(String data) {
	String p[]=data.split(",");
	Player player=new Player(p[0], p[1], p[2]);
	return player;
	
}
}
         