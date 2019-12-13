package com.techelevator.npgeek.model;

public class Park {

	private String parkCode;
	private String parkName;
	private String state;
	private double acreage;
	private double elevationFeet;
	private double milesOfTrail;
	private int numOfCampsites;
	private String climate;
	private int yearFounded;
	private int annualVisitorCount;
	private String quote;
	private String quoteSource;
	private String parkDescription;
	private double entryFee;
	private int numOfAnimalSpecies;

	public Park(String parkCode, String parkName, String state, double acreage, double elevationFeet,
			double milesOfTrail, int numOfCampsites, String climate, int yearFounded, int annualVisitorCount,
			String quote, String quoteSource, String parkDescription, double entryFee, int numOfAnimalSpecies) {
		this.parkCode = parkCode;
		this.parkName = parkName;
		this.state = state;
		this.acreage = acreage;
		this.elevationFeet = elevationFeet;
		this.milesOfTrail = milesOfTrail;
		this.numOfCampsites = numOfCampsites;
		this.climate = climate;
		this.yearFounded = yearFounded;
		this.annualVisitorCount = annualVisitorCount;
		this.quote = quote;
		this.quoteSource = quoteSource;
		this.parkDescription = parkDescription;
		this.entryFee = entryFee;
		this.numOfAnimalSpecies = numOfAnimalSpecies;
	}
	public Park() {
		
	}

	public String getParkCode() {
		return parkCode;
	}

	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getAcreage() {
		return acreage;
	}

	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}

	public double getElevationFeet() {
		return elevationFeet;
	}

	public void setElevationFeet(double elevationFeet) {
		this.elevationFeet = elevationFeet;
	}

	public double getMilesOfTrail() {
		return milesOfTrail;
	}

	public void setMilesOfTrail(double milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}

	public int getNumOfCampsites() {
		return numOfCampsites;
	}

	public void setNumOfCampsites(int numOfCampsites) {
		this.numOfCampsites = numOfCampsites;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public int getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}

	public int getAnnualVisitorCount() {
		return annualVisitorCount;
	}

	public void setAnnualVisitorCount(int annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getQuoteSource() {
		return quoteSource;
	}

	public void setQuoteSource(String quoteSource) {
		this.quoteSource = quoteSource;
	}

	public String getParkDescription() {
		return parkDescription;
	}

	public void setParkDescription(String parkDescription) {
		this.parkDescription = parkDescription;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public int getNumOfAnimalSpecies() {
		return numOfAnimalSpecies;
	}

	public void setNumOfAnimalSpecies(int numOfAnimalSpecies) {
		this.numOfAnimalSpecies = numOfAnimalSpecies;
	}



}
