package com.testintegration.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "trainer")
public class Trainer {
	
	@Id
	private int trainerId;
	private String trainerName;
	private int technologyId;
	private Date trainerAvailFromDate;
	private Date trainerAvailTillDate;
	private Time trainerAvailFromTime;	
	private Time trainerAvailTillTime;
	private int alreadyAssigned;
	private String contact;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public int getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}
	public Date getTrainerAvailFromDate() {
		return trainerAvailFromDate;
	}
	public void setTrainerAvailFromDate(Date trainerAvailFromDate) {
		this.trainerAvailFromDate = trainerAvailFromDate;
	}
	public Date getTrainerAvailTillDate() {
		return trainerAvailTillDate;
	}
	public void setTrainerAvailTillDate(Date trainerAvailTillDate) {
		this.trainerAvailTillDate = trainerAvailTillDate;
	}
	public Time getTrainerAvailFromTime() {
		return trainerAvailFromTime;
	}
	public void setTrainerAvailFromTime(Time trainerAvailFromTime) {
		this.trainerAvailFromTime = trainerAvailFromTime;
	}
	public Time getTrainerAvailTillTime() {
		return trainerAvailTillTime;
	}
	public void setTrainerAvailTillTime(Time trainerAvailTillTime) {
		this.trainerAvailTillTime = trainerAvailTillTime;
	}
	public int getAlreadyAssigned() {
		return alreadyAssigned;
	}
	public void setAlreadyAssigned(int alreadyAssigned) {
		this.alreadyAssigned = alreadyAssigned;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", technologyId=" + technologyId
				+ ", trainerAvailFromDate=" + trainerAvailFromDate + ", trainerAvailTillDate=" + trainerAvailTillDate
				+ ", trainerAvailFromTime=" + trainerAvailFromTime + ", trainerAvailTillTime=" + trainerAvailTillTime
				+ ", alreadyAssigned=" + alreadyAssigned + ", contact=" + contact + "]";
	}
	



}
	
	
	