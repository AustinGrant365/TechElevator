package com.techelevator.npgeek.model;

public class Weather {
	
	private String parkCode;
	private int fiveDayForecast;
	private int lowTemp;
	private int highTemp;
	private String forecast;
	
	public String getParkCode() {
		return parkCode;
	}
	public int getFiveDayForecast() {
		return fiveDayForecast;
	}
	public int getLowTemp() {
		return lowTemp;
	}
	public int getHighTemp() {
		return highTemp;
	}
	public String getForecast() {
		return forecast;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public void setFiveDayForecast(int fiveDayForecast) {
		this.fiveDayForecast = fiveDayForecast;
	}
	public void setLowTemp(int lowTemp) {
		this.lowTemp = lowTemp;
	}
	public void setHighTemp(int highTemp) {
		this.highTemp = highTemp;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	
	

}
