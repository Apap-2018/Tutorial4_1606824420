package com.apap.tutorial4.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apap.tutorial4.model.CarModel;
import com.apap.tutorial4.model.DealerModel;
import com.apap.tutorial4.service.CarService;
import com.apap.tutorial4.service.DealerService;

/**
 * DeallerController
 */
@Controller
public class DealerController {
	@Autowired 
	private DealerService dealerService;
	
	@Autowired
	private CarService carService;
	
	@RequestMapping("/")
	private String home() {
		return"home";
	}
	@RequestMapping(value = "/dealer/add", method = RequestMethod.GET)
		private String add(Model model) {
		model.addAttribute("dealer", new DealerModel());
		return"addDealer";
	}
	 
	@RequestMapping(value = "/dealer/add", method = RequestMethod.POST)
	private String addDealerSubmit(@ModelAttribute DealerModel dealer) {
		dealerService.addDealer(dealer);
		return"add";
	}
	@RequestMapping(value = "/dealer/view", method = RequestMethod.GET)
	private String viewDealer(@RequestParam ("dealerId") long dealerId, Model model) {
		DealerModel dealer = dealerService.getDealerDetailById(dealerId).get();
		
		model.addAttribute("dealer", dealer);
		model.addAttribute("id", dealerId);
		return "view-dealer";
	}
}