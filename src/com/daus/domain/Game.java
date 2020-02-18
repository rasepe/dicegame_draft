package com.daus.domain;

public class Game {
	protected int id;
	private Player player;
private int dice1;
private int dice2;
private boolean hasWon = false;


private static int COUNTER = 1;

public Game(Player player)  {
	this.id = COUNTER;
	COUNTER++;
	this.player = player;

	this.dice1 = (int) Math.floor(Math.random()*6+1);
	this.dice2 = (int) Math.floor(Math.random()*6+1);
	
	if (dice1 + dice2 == 7) {
		hasWon = true;
	}
	
	player.getGames().add(this);
	double points = 0;
	double succesRate;
	//double gamesPlayed;
	for (int i=0; i<player.getGames().size(); i++) {
		if(player.getGames().get(i).isHasWon()) {
			points += 100;
		}
	}
	succesRate = points / player.getGames().size();
	player.setSuccess(succesRate);
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}

public int getDice1() {
	return dice1;
}

public void setDice1(int dice1) {
	this.dice1 = dice1;
}

public int getDice2() {
	return dice2;
}

public void setDice2(int dice2) {
	this.dice2 = dice2;
}

public boolean isHasWon() {
	return hasWon;
}

public void setHasWon(boolean hasWon) {
	this.hasWon = hasWon;
}

@Override
public String toString() {
	return "Game [id=" + id + ", player=" + player + ", dice1=" + dice1 + ", dice2=" + dice2 + ", hasWon=" + hasWon
			+ "]";
}




}
