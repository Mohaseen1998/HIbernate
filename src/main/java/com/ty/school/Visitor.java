package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visitor {
	@Id
	private int id;
	private String name;
	private String email;
	private LocalDate DOB;
	private LocalDateTime visitdateandtime;
	private char gender;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public LocalDateTime getVisitdateandtime() {
		return visitdateandtime;
	}

	public void setVisitdateandtime(LocalDateTime visitdateandtime) {
		this.visitdateandtime = visitdateandtime;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
