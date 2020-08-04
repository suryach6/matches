package com.cg.service;

import com.cg.beans.Match;
import com.cg.beans.Team;

public class MatchBo {
	Match match = new Match();
	public Match createMatch(String data, Team[] teamList) {
		String datas[]  = data.split(",");
		match.setDate(datas[0]);
		for(Team team: teamList) {
			if(team.getName().equals(datas[1])) {
				
				match.setTeamone(team);
			}
		}
		
		for(Team team: teamList) {
			if(team.getName().equals(datas[2])) {
				
				match.setTeamtwo(team);
			}
		}
		
		match.setVenue(datas[3]);
		return match;
	}
	
	public Team findTeam(String matchDate, Match[] matchList) {
		for(Match match: matchList) {
			if(match.getDate().equals(matchDate)) {
			 System.out.println(match.getTeamone());
			 System.out.println(match.getTeamtwo());
			}
		}
		return null;
	
		
	}
	
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(Match match: matchList) {
			if(match.getTeam().equals(teamName)) {
				System.out.println(match.getTeam());
				continue;
			}
		}
	}
}
