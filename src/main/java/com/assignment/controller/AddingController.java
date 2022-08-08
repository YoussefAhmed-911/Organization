package com.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.response.AddingResponse;



@RestController
@RequestMapping("/add")
public class AddingController {

	@GetMapping("/get/{num1}/{num2}")
	//@RequestMapping(value = "/get", method = RequestMethod.GET)
	public AddingResponse getAddition(@PathVariable int num1, @PathVariable int num2) {
	
		return new AddingResponse(num1, num2);
	}
	
	
}
