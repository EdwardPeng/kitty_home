package com.kthome.controller;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kthome.jpa.entity.UserProfile;
import com.kthome.jpa.repository.UserProfileRepository;

@Controller
public class PageController {

	@Resource
	private UserProfileRepository userProfileRepository;

	@RequestMapping(value = "test")
	public String test(ModelMap model) {
		// Iterable<UserProfile> it = userProfileRepository.findAll();
		UserProfile userProfile = userProfileRepository.findByUserId("1234567");
		System.out.println(ReflectionToStringBuilder.reflectionToString(userProfile, ToStringStyle.SHORT_PREFIX_STYLE));
		return "test";
	}
}
