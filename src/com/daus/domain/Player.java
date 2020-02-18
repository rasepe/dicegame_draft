package com.daus.domain;

import java.util.ArrayList;
import java.util.Date;

public class Player {
	protected int id;
	private String name;
	private Date registryDate = new Date();
	private ArrayList<Game> games = new ArrayList<Game>();
	private double success;
	
	private static int COUNTER = 1;
	

	public Player(String name) {
		this.id = COUNTER;
		COUNTER++;
		this.registryDate = registryDate;
		this.name = name;
		
		
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getRegistryDate() {
		return registryDate;
	}



	public void setRegistryDate(Date registryDate) {
		this.registryDate = registryDate;
	}



	public ArrayList<Game> getGames() {
		return games;
	}



	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}



	public double getSuccess() {
		return success;
	}



	public void setSuccess(double success) {
		this.success = success;
	}



	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", registryDate=" + registryDate + ", games=" + games
				+ ", success=" + success + "]";
	}




	
}
