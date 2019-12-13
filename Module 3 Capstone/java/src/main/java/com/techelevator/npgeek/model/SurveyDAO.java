package com.techelevator.npgeek.model;

import java.util.List;


public interface SurveyDAO {
	
	public void saveSurvey(Survey survey); 
	
	public List<Survey> getAllSurveys();
		//may create method for surveyResults use .jsp for results

	public void saveSurvey(List<Survey> surveys);

	public List<Survey> getParkSurveyVotes(String parkCode);
	
	public List<Survey> getParkSurveyVotes();

}
