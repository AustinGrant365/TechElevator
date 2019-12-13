package com.techelevator.npgeek;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDAO;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDAO;
import com.techelevator.npgeek.model.Weather;
import com.techelevator.npgeek.model.WeatherDAO;

@Controller
public class ParkController {
	
	@Autowired
	private ParkDAO parkDAO;
	
	@Autowired
	private WeatherDAO weatherDAO;
	
	@RequestMapping(path= { "/", "/homePage" }, method=RequestMethod.GET)
	public String displayHomePage(ModelMap modelMap) {
		List<Park> parks = parkDAO.getAllParks();
		modelMap.addAttribute("parks", parks);
		return "homePage";
		}
	
	@RequestMapping(path="/parkDetail", method=RequestMethod.GET)
	public String displayParkDetail(
			@RequestParam(value="parkCode") 
			String parkCode,
			ModelMap modelMap, 
			@RequestParam(value="temperature", required=false) 
			String temperature) {
		Park parkInfo = parkDAO.getParkInfo(parkCode);
		List<Weather> weatherInfo = weatherDAO.getWeatherByParkCode(parkCode);
		modelMap.put("parkDetail", parkInfo);
		modelMap.put("weather", weatherInfo);
		return "parkDetail";
		}
	
	@RequestMapping(path= { "/forecast" }, method=RequestMethod.GET)
	public String displayForecast(
			@RequestParam("weatherParkCode") 
			String parkCode,
			ModelMap modelMap) {
		Park parkInfo = parkDAO.getParkInfo(parkCode);
		List<Weather> weather = weatherDAO.getWeatherByParkCode(parkCode);
		modelMap.put("weather", weather);
		modelMap.put("parkDetail", parkInfo);
		return "forecast";
		}
	
	@RequestMapping(path = "/forecast", method = RequestMethod.POST)
	public String changeTemperatureFC(
			HttpSession session, 
			@RequestParam String temp, 
			@RequestParam String parkCode) {
	    if (temp.equals("Celsius")) {
	        Boolean celcius = true;
	        session.setAttribute("celcius", celcius);
	    } else {
	        Boolean celcius = false;
	        session.setAttribute("celcius", celcius);
	    }
	    return "redirect:/parkDetail?parkcode=" + parkCode;
	}
	
}
