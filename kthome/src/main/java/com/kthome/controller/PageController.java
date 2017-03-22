package com.kthome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kthome.entity.UserProfile;
import com.kthome.repository.UserProfileRepository;

@Controller
public class PageController {

	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@RequestMapping(value = "test")
	public String test(ModelMap model) {
		Iterable<UserProfile> it = userProfileRepository.findAll();
		System.out.print(it);
		return "test";
	}
}
