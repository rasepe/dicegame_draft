package com.daus.application;

import com.daus.domain.Game;
import com.daus.domain.Player;

//import com.jobs.application.JobsController;

public class Main {

	
	
	//private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		Player player1 = new Player("Ricardo");
		Player player2 = new Player("Manuel");
		System.out.println(player1);
		System.out.println(player2);
		Game game1 = new Game(player1);
		 Game game2 = new Game(player1); 
		 Game game3 = new Game(player1); 
		 Game game4 = new Game(player1); 
		 Game game5 = new Game(player1); 
		 Game game6 = new Game(player1);
		 Game game7 = new Game(player1);
		 Game game8 = new Game(player1);
		 Game game9 = new Game(player1);
		 Game game10 = new Game(player1);

		
		System.out.print("fi");
		
		 
		 
		//System.out.println(game1);
		/*
		 * System.out.println(game2); System.out.println(game3);
		 * System.out.println(game4); System.out.println(game5);
		 * System.out.println(game6);
		 */
		//System.out.println(player1);
	}

}
