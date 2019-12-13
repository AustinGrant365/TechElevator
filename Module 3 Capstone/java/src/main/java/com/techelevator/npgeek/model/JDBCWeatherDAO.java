package com.techelevator.npgeek.model;

import java.util.ArrayList;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCWeatherDAO implements WeatherDAO {
	
private JdbcTemplate jdbcTemplate;
	@Autowired
	public JDBCWeatherDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<Weather> getWeatherByParkCode(String parkCode) {
		List<Weather> weatherByCode = new ArrayList<>();
		String sqlGetWeatherByParkCode = "SELECT * FROM weather WHERE parkcode = ? ORDER BY fivedayforecastvalue asc";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetWeatherByParkCode, parkCode);
		
		while(results.next()) {
			Weather tempWeather = new Weather();
			tempWeather.setFiveDayForecast(results.getInt("fivedayforecastvalue"));
			tempWeather.setForecast(results.getString("forecast"));
			tempWeather.setHighTemp(results.getInt("high"));
			tempWeather.setLowTemp(results.getInt("low"));
			tempWeather.setParkCode(results.getString("parkcode"));
			weatherByCode.add(tempWeather);
		}
		return weatherByCode;
	}
	
	
	// method for convert temp
	public double convertToCelcius(double fahrenheit) {
		double celcius = (fahrenheit - 32) * 5 / 9;
		return celcius;
	}
	
	public double convertToFahrenheit(double celcius) {
		double fahrenheit = (celcius * 9 / 5.0) + 32; // add formula for conversion
		return fahrenheit;
	}

	
//	public String getAdvisory() {
//
//		String result = "";
//		switch (this.getForecast()) {
//		case "snow":
//			result = "Pack some snowshoes! ";
//			break;
//		case "rain":
//			result = "Pack your raingear and wear rainboots! ";
//			break;
//		case "thunderstorms":
//			result = "Seek shelter and avoid hiking on exposed ridges! ";
//			break;
//		case "sun":
//			result = "Remember to pack some sunblock! ";
//			break;
//		}
//
//		int high = this.getHigh();
//		int low = this.getLow();
//
//		if (high > 75) {
//			result += "Don't forget to bring extra water! ";
//		}
//		if (low < 20) {
//			result += "Will be chilly, dress warm! ";
//		}
//		if ((high - low) > 20) {
//			result += "Wear breathable layers!";
//		}
//
//		return result;
//	}
	
}





































