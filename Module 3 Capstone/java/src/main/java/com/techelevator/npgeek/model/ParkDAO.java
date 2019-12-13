package com.techelevator.npgeek.model;

import java.util.List;

public interface ParkDAO {
	
	public Park getParkInfo(String name); 
	
	public List<Park> getAllParks();
	
	public List<Park> getAllParks(String parkCode);
	
	

}
