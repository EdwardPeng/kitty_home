package com.kthome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kthome.jpa.entity.UserProfile;
import com.kthome.service.UserProfileService;
import com.kthome.service.vo.UserProfileRequestVo;

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
		return "editUserProfile";
	}
	
	@RequestMapping(value = "editShowUserProfile")
	public String editShow(UserProfileRequestVo request, ModelMap model) {
		String userId = request.getUserId();
		UserProfile userProfile = userProfileService.findByUserId(userId);
		model.addAttribute("userProfile", userProfile);
		return "editUserProfile";
	}
}
