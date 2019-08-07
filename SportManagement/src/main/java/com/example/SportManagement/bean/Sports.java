package com.example.SportManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addevent")
public class Sports 
{

	@Id
	
	private int teamid;
	private String sportsname;
	private String date;  
	private String venue;
	
	private int entryfee;
	private int firstprice;

	private int secondprice;
	private int thirdprice;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getSportsname() {
		return sportsname;
	}
	public void setSportsname(String sportsname) {
		this.sportsname = sportsname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public int getEntryfee() {
		return entryfee;
	}
	public void setEntryfee(int entryfee) {
		this.entryfee = entryfee;
	}
	public int getFirstprice() {
		return firstprice;
	}
	public void setFirstprice(int firstprice) {
		this.firstprice = firstprice;
	}
	public int getSecondprice() {
		return secondprice;
	}
	public void setSecondprice(int secondprice) {
		this.secondprice = secondprice;
	}
	public int getThirdprice() {
		return thirdprice;
	}
	public void setThirdprice(int thirdprice) {
		this.thirdprice = thirdprice;
	}
	
	
	
}
