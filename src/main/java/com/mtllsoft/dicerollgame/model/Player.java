package com.mtllsoft.dicerollgame.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {

	@Id
	private int id;
	@Column
	private String name;
	@Column (name="won_rate")
	private double wonRate;
	@Column (name = "registration_date")
	private Date registrationDate;
	
	
	public Player() {
	}


	public Player(int id, String name, double wonRate) {
		this.id = id;
		this.name = name;
		this.wonRate = wonRate;
	}


	public long getId() {
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


	public double getWonRate() {
		return wonRate;
	}


	public void setWonRate(double wonRate) {
		this.wonRate = wonRate;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", wonRate=" + wonRate + ", registrationDate=" + registrationDate
				+ "]";
	}
	
}
