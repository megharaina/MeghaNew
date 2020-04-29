package com.testintegration.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testintegration.dao.IncomingRequestsDao;
import com.testintegration.dao.RoomDao;
import com.testintegration.dao.TrainerDao;
import com.testintegration.model.IncomingRequests;
import com.testintegration.model.Room;
import com.testintegration.model.Trainer;

@Service
public class TrainerService {

	@Autowired
	private IncomingRequestsDao incomingRequests;

	public List<IncomingRequests> findAllRequests() {
		List<IncomingRequests> incReq = new ArrayList<>();
		Iterable<IncomingRequests> requestList = incomingRequests.findAll();
		requestList.forEach(incReq::add);
		return incReq;
	}

	@Autowired
	private TrainerDao trainerDao;
	

	public List<Trainer> findAllTrainers() {
		List<Trainer> trainers = new ArrayList<>();
		Iterable<Trainer> trainerList = trainerDao.findAll();
		trainerList.forEach(trainers::add);
		return trainers;
	}
	
	public List<String> findTrainerNames(Date trainerAvailFromDate,Date trainerAvailTillDate,Time trainerAvailFromTime,Time trainerAvailTillTime,Integer technologyId) throws SQLException
	{
		List<IncomingRequests> trainers = new ArrayList<>();
		trainers=findAllRequests();
		List<String> list=new ArrayList<>();
		list=trainerDao.findByQuery(trainerAvailFromDate,trainerAvailTillDate,trainerAvailFromTime,trainerAvailTillTime,technologyId);
		return list;		
	}
	
	@Autowired
	private RoomDao roomDao;
	
	public List<Room> findAllRooms(){
		List<Room> room= new ArrayList<>();
		Iterable<Room> roomList=roomDao.findAll();
		roomList.forEach(room::add);
		return room;
	}

	public List<String> findRoomNumber(Date roomAvailFromDate,Date roomAvailTillDate,Time roomAvailFromTime,Time roomAvailTillTime,int capacity){
		List<String> list= new ArrayList<>();
		list=roomDao.findByQuery(roomAvailFromDate,roomAvailTillDate,roomAvailFromTime,roomAvailTillTime,capacity);
		return list;
	}
	/*
	 * public List<Trainer> deleteById(int id) { trainerDao.deleteById(id);
	 * List<Trainer> trainers = new ArrayList<>(); Iterable<Trainer> trainerList =
	 * trainerDao.findAll(); trainerList.forEach(trainers::add); return trainers;
	 * 
	 * }
	 */
}
