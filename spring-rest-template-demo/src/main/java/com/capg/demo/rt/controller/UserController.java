package com.capg.demo.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.rt.model.User;

@Controller
public class UserController {
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping("/getDetails")
	public String getUserInfo(@RequestParam("userId") String userId, Model m) {
		User user=rt.getForObject("https://api.github.com/users/"+userId, User.class);
		System.out.println(user);
		m.addAttribute("user", user);
	
		return "show-user-details.jsp";
		
	}	
		
	}
