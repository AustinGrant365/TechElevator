package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCParkDAO implements ParkDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCParkDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Park> getAllParks(String parkCode) {
		List<Park> parkList = new ArrayList<Park>();
		String sqlGetAllParks = "SELECT * FROM park ORDER BY parkname"; 
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllParks);
		while (results.next()) {
			Park parkInfo = new Park();
			parkInfo.setParkCode(results.getString("parkcode"));
			parkInfo.setParkName(results.getString("parkname"));
			parkInfo.setState(results.getString("state"));
			parkInfo.setAcreage(results.getDouble("acreage"));
			parkInfo.setElevationFeet(results.getDouble("elevationinfeet"));
			parkInfo.setMilesOfTrail(results.getDouble("milesoftrail"));
			parkInfo.setNumOfCampsites(results.getInt("numberofcampsites"));
			parkInfo.setClimate(results.getString("climate"));
			parkInfo.setYearFounded(results.getInt("yearfounded"));
			parkInfo.setAnnualVisitorCount(results.getInt("annualvisitorcount"));
			parkInfo.setQuote(results.getString("inspirationalquote"));
			parkInfo.setQuoteSource(results.getString("inspirationalquotesource"));
			parkInfo.setParkDescription(results.getString("parkdescription"));
			parkInfo.setEntryFee(results.getDouble("entryfee"));
			parkInfo.setNumOfAnimalSpecies(results.getInt("numberofanimalspecies"));
			parkList.add(parkInfo);
		}
		
		return parkList;
	}

	@Override
	public Park getParkInfo(String parkCode) {
		Park parkInfo = new Park();
		String sqlGetAllParks = "SELECT * FROM park WHERE parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllParks, parkCode);
		while (results.next()) {
			parkInfo.setParkCode(results.getString("parkcode"));
			parkInfo.setParkName(results.getString("parkname"));
			parkInfo.setState(results.getString("state"));
			parkInfo.setAcreage(results.getDouble("acreage"));
			parkInfo.setElevationFeet(results.getDouble("elevationinfeet"));
			parkInfo.setMilesOfTrail(results.getDouble("milesoftrail"));
			parkInfo.setNumOfCampsites(results.getInt("numberofcampsites"));
			parkInfo.setClimate(results.getString("climate"));
			parkInfo.setYearFounded(results.getInt("yearfounded"));
			parkInfo.setAnnualVisitorCount(results.getInt("annualvisitorcount"));
			parkInfo.setQuote(results.getString("inspirationalquote"));
			parkInfo.setQuoteSource(results.getString("inspirationalquotesource"));
			parkInfo.setParkDescription(results.getString("parkdescription"));
			parkInfo.setEntryFee(results.getDouble("entryfee"));
			parkInfo.setNumOfAnimalSpecies(results.getInt("numberofanimalspecies"));
		}
		return parkInfo;
	}


	@Override
	public List<Park> getAllParks() {
		List<Park> parkList = new ArrayList<Park>();
		String sqlGetAllParks = "SELECT * FROM park ORDER BY parkname"; 
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllParks);
		while (results.next()) {
			Park parkInfo = new Park();
			parkInfo.setParkCode(results.getString("parkcode"));
			parkInfo.setParkName(results.getString("parkname"));
			parkInfo.setState(results.getString("state"));
			parkInfo.setAcreage(results.getDouble("acreage"));
			parkInfo.setElevationFeet(results.getDouble("elevationinfeet"));
			parkInfo.setMilesOfTrail(results.getDouble("milesoftrail"));
			parkInfo.setNumOfCampsites(results.getInt("numberofcampsites"));
			parkInfo.setClimate(results.getString("climate"));
			parkInfo.setYearFounded(results.getInt("yearfounded"));
			parkInfo.setAnnualVisitorCount(results.getInt("annualvisitorcount"));
			parkInfo.setQuote(results.getString("inspirationalquote"));
			parkInfo.setQuoteSource(results.getString("inspirationalquotesource"));
			parkInfo.setParkDescription(results.getString("parkdescription"));
			parkInfo.setEntryFee(results.getDouble("entryfee"));
			parkInfo.setNumOfAnimalSpecies(results.getInt("numberofanimalspecies"));
		
			parkList.add(parkInfo);
		}
		return parkList;
	}
}










