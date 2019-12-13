package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCSurveyDAO implements SurveyDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCSurveyDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void saveSurvey(Survey survey) {	
		String sqlToSaveSurvey="INSERT INTO survey_result (parkcode, emailaddress, state, activitylevel)" +
					" VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(sqlToSaveSurvey, survey.getParkCode(), survey.getEmail(),
				survey.getState(), survey.getActivityLevel()); 
	}
	
	
	public List<Survey> getAllSurveys() {
		List<Survey> allSurveys = new ArrayList<>();
		String sqlToGetAllSurveys="SELECT * FROM survey_result";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlToGetAllSurveys);
		while(results.next()) {
			Survey tempSurvey = new Survey();
			tempSurvey.setSurveyId(results.getInt("surveyid"));
			tempSurvey.setParkCode(results.getString("parkcode"));
			tempSurvey.setEmail(results.getString("emailaddress"));
			tempSurvey.setState(results.getString("state"));
			tempSurvey.setActivityLevel(results.getString("activitylevel"));
			allSurveys.add(tempSurvey);
		}
		return allSurveys;
	}
	
	
	public List<Survey> getParkSurveyVotes() {
		List<Survey> parkSurveyVotes = new ArrayList<>();
//		parkSurveyVotes.add(new Survey());
		String sqlToGetParkSurveyCount = "SELECT COUNT(parkcode) AS votecount, parkcode, park.parkname, parkdescription, ARRAY_AGG (surveyid)" + 
				" FROM survey_result INNER JOIN park USING (parkcode)" + 
				" GROUP BY survey_result.parkcode, park.parkname, parkdescription ORDER BY votecount desc";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlToGetParkSurveyCount);
		while(results.next()) {
			Survey tempSurvey = new Survey();
			tempSurvey.setParkCode(results.getString("parkcode"));
			tempSurvey.setParkName(results.getString("parkname"));
			tempSurvey.setParkDescription(results.getString("parkdescription"));
// tried to have a Survey class type/field for voteCount to access the SQL
// results column name variable, but I get an error whether it's a String, Integer, or int
// when it's a String it's NumberFormatException and when an Int vice versa
			tempSurvey.setVoteCount(results.getString("votecount"));
			parkSurveyVotes.add(tempSurvey);
		}
//		Collections.sort(parkSurveyVotes, Collections.reverseOrder());
		return parkSurveyVotes;
	}
	
//	public List<Survey> sortParksBySurveyVotes() {
//		List<Survey> parkSurveyVotes = new ArrayList<>();
//		String sqlToGetAllSurveys="SELECT * FROM survey_result";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlToGetAllSurveys);
//		while(results.next()) {
//			Survey tempSurvey = new Survey();
//			tempSurvey.setSurveyId(results.getInt("surveyid"));
//			tempSurvey.setParkCode(results.getString("parkcode"));
//			tempSurvey.setEmail(results.getString("emailaddress"));
//			tempSurvey.setState(results.getString("state"));
//			tempSurvey.setActivityLevel(results.getString("activitylevel"));
//			parkSurveyVotes.add(tempSurvey);
//		}
//		return parkSurveyVotes;
//	}

	@Override
	public void saveSurvey(List<Survey> surveys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Survey> getParkSurveyVotes(String parkCode) {
		// TODO Auto-generated method stub
		return null;
	}
	
}












