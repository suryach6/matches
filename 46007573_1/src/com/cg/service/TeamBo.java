package com.cg.service;

import com.cg.beans.Player;
import com.cg.beans.Team;

public class TeamBo {
   public Team createTeam(String data, Player[]PlayerList) {
	   Team team = new Team();
		String bo[] = data.split(",");
		team.setName(bo[0]);
		for(Player player: PlayerList) {
			if(player.getName().equals(bo[1])) {
				team.setPlayer(player);
			}
		}
		return team;
   }
}
