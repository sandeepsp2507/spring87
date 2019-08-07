package com.example.SportManagement.bean;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userregister")
public class Register 
{
	@Id
	private String teamname;
	@Override
	public String toString() {
		return "Register [teamname=" + teamname + ", email=" + email + ", mobilenumber=" + mobilenumber
				+ ", getTeamname()=" + getTeamname() + ", getEmail()=" + getEmail() + ", getMobilenumber()="
				+ getMobilenumber() + "]";
	}
	private String email;
	private int mobilenumber;
	public Register(String teamname2, String email2, int mobilenumber2) {
		
	}
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
}
