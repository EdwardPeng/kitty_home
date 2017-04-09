package com.kthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kthome.service.UserProfileService;

@Controller
public class UserProfileContorller {

	@Autowired
	private UserProfileService userProfileService;
	
	@RequestMapping(value = "/queryUserProfile")
	public String query(ModelMap model) {
		return "queryUserProfile";
	}
	
	@RequestMapping(value = "addShowUserProfile")
	public String addShow(ModelMap model) {
		return null;
	}
	
	@RequestMapping(value = "editShowUserProfile")
	public String editShow(ModelMap model) {
		return null;
	}
}
