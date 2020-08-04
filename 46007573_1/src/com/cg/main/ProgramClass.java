package com.cg.main;

import java.util.Scanner;

import com.cg.beans.Match;
import com.cg.beans.Player;
import com.cg.beans.Team;
import com.cg.service.MatchBo;
import com.cg.service.PlayerBo;
import com.cg.service.TeamBo;

public class ProgramClass {
public static void main(String[] args) {
	PlayerBo player = new PlayerBo();
	TeamBo team = new TeamBo();
	MatchBo match = new MatchBo();
	
	Player plist[]= new Player[10];
	Match mlist[]= new Match[10];
	Team tlist[]= new Team[10];
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter player count:");
	int num = sc.nextInt();
	for(int i=1,k=0;i<=num;i++,k++) {
		System.out.println("Enter player "+ i + " details");
		String details = sc.next();
		plist[k] = player.createPlayer(details);
		
	}
	
	
	
	System.out.println("Enter team count:");
	int num1 = sc.nextInt();
	for(int i=1,k=0;i<=num1;i++,k++) {
		System.out.println("Enter team "+ i + " details");
		String details = sc.next();
		tlist[k] = team.createTeam(details, plist);
	}
	
	System.out.println("Enter match count:");
	int num2 = sc.nextInt();
	for(int i=1,k=0;i<=num2;i++,k++) {
		System.out.println("Enter match "+ i + " details");
		String details = sc.next();
		mlist[k] = match.createMatch(details, tlist);
	}
	while(true) {
	System.out.println("Menu:");
	System.out.println("1) Find Team");
	System.out.println("2) Find all matches in a specific venues");
	System.out.println("Type 1 or 2");
	System.out.println("Enter your choice");
	int num3 = sc.nextInt();
	switch(num3) {
	case 1:
		System.out.println("Enter Match Date");
		String date = sc.next();
		match.findTeam(date, mlist);
		break;
	case 2:
		System.out.println("Enter team name:");
		break;
		
	default:
		System.out.println("Do you want to continue? Y/N");
		String choice = sc.next();
		if(choice.equals("Y")) {
			continue;
		}
		else {
			System.out.println("Exit");
			break;
		}
	}
}
}
}
