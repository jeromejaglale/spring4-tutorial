package com.jeromejaglale.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeromejaglale.domain.Car;
import com.jeromejaglale.service.CarService;

@Controller
public class CarController {
	@Autowired
	private CarService carService;
	
	@RequestMapping("/car/list")
	public void carList(Model model) {
		List<Car> carList = carService.findAll();
		model.addAttribute("carList", carList);
	}
	
	@RequestMapping("/car/add")
	public void carAdd() {
	}
	
	@RequestMapping(value="/car/add", method=RequestMethod.POST)
	public String carAddSubmit(@ModelAttribute("car") @Valid Car car, BindingResult result) {
		if(result.hasErrors()) {
			// show the form again, with the errors
			return "car/add";
		}
	
		// validation was successful
		carService.add(car);
		return "redirect:/car/list";
			
	}
}