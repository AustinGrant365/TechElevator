package com.techelevator.npgeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDAO;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDAO;

@Controller
public class SurveyController {
	@Autowired
	private ParkDAO parkDAO;

	@Autowired
	private SurveyDAO surveyDAO;

	@RequestMapping(path = "/survey", method = RequestMethod.GET)
	public String displaySurveyForm(ModelMap modelmap) {
		List<Park> parks = parkDAO.getAllParks();
		modelmap.addAttribute("parks", parks);
		
		if (!modelmap.containsAttribute("survey"))
			modelmap.addAttribute("survey", new Survey());
		// how do we add the park Object, parkName type for dropdown menu
		return "survey";
	}

	@RequestMapping(path = "/survey", method = RequestMethod.POST)
	public String submitSurvey(@Valid @ModelAttribute Survey survey, BindingResult result, RedirectAttributes flash) {
		if (result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "survey", result);
			flash.addFlashAttribute("survey", survey);
			return "redirect:/survey";
		}
		surveyDAO.saveSurvey(survey);
		return "redirect:/surveyResults";
	}

	@RequestMapping(path = "/surveyResults", method = RequestMethod.GET)
	public String displaySurveyResults(
			String parkCode,
			ModelMap modelmap) {
		List<Park> parks = parkDAO.getAllParks(parkCode);
		List<Survey> surveys = surveyDAO.getParkSurveyVotes();
		int voteCount = surveys.indexOf(0);
//		Park parkDesc = parks.get((12));
		modelmap.put("parks", parks);
		modelmap.put("surveys", surveys);
		modelmap.put("votecount", voteCount);
//		modelmap.put("parkName", parkName);
//		modelmap.put("parkdescription", parkDesc);
		return "surveyResults";
	}
	
	@RequestMapping(path = "/parkVotes", method = RequestMethod.GET)
	public String displayParkSurveyVotes(
//			String parkCode,
			ModelMap modelmap) {
//		List<Park> parks = parkDAO.getAllParks();
		List<Survey> surveys = surveyDAO.getParkSurveyVotes();
//		surveys.add(parks);
//		List<Object> parkSurveys = new ArrayList<>();
//		parkSurveys.addAll(surveys);
//		parkSurveys.addAll(parks);
//		modelmap.put("parks", parks);
		modelmap.put("surveys", surveys);
		return "parkVotes";
	}
	
}






























