package com.techelevator.npgeek.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Survey {

	private double surveyId;
	
	@NotBlank(message = "Please select your favorite park")
	private String parkCode;

	@Email(message="You must enter a valid email address")
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Please select your state of residence")
	private String state;
	
	@NotBlank(message = "Please enter your activity level")
	private String activityLevel;
	
	private String parkName;
	
	private String parkDescription;
	
	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getParkDescription() {
		return parkDescription;
	}

	public void setParkDescription(String parkDescription) {
		this.parkDescription = parkDescription;
	}

	// tried to make a variable so I could access the SQL variable I created for 
	// votecount 
	private String voteCount;

	public double getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(double surveyId) {
		this.surveyId = surveyId;
	}

	public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}

	public String getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(String voteCount) {
		this.voteCount = voteCount;
	}

}
