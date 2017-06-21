package com.kthome.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
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
		model.addAttribute("action", "addUserProfile");
		return "editUserProfile";
	}
	
	@RequestMapping(value = "editShowUserProfile")
	public String editShow(UserProfileRequestVo request, ModelMap model) {
		String userId = request.getUserId();
		UserProfile userProfile = userProfileService.findByUserId(userId);
		model.addAttribute("action", "editUserProfile");
		model.addAttribute("userProfile", userProfile);
		return "editUserProfile";
	}
	
	@RequestMapping(value = "{action}UserProfile")
	public ResponseEntity<String> save(@PathVariable String action, 
			UserProfileRequestVo request, ModelMap model) {
		String userName = request.getUserName();
		String gender = request.getGender();
		String zip = request.getZip();
		String address = request.getAddress();
		String phone = request.getPhone();
		String line = request.getLine();
		
		UUID uuid = UUID.randomUUID();
		Date now = new Date();
		switch(action) {
		case "add":
			UserProfile userProfile = new UserProfile();
			userProfile.setUserId(uuid.toString());
			userProfile.setUserName(userName);
			userProfile.setGender(gender);
			userProfile.setZip(zip);
			userProfile.setAddress(address);
			userProfile.setPhone(phone);
			userProfile.setLine(line);
			userProfile.setStatus("A");
			userProfile.setCreateBy("admin");
			userProfile.setCreateDate(now);
			userProfile.setUpdateBy("admin");
			userProfile.setUpdateDate(now);
			userProfileService.saveOrUpdate(userProfile);
			break;
		case "edit":
			break;
		}
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "queryUserProfileAjax", produces="application/json")
	public @ResponseBody String queryUserProfile(UserProfileRequestVo request, ModelMap model) {
		String name = StringUtils.trim(request.getUserName());
		String phone  = StringUtils.trim(request.getPhone());
		
		Page<UserProfile> userProfileDataList = userProfileService.query(name, phone, 0, 10);
		
		Gson gson = new Gson();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", 0);
		map.put("total", userProfileDataList.getTotalPages());
		map.put("records", userProfileDataList.getSize());
		map.put("rows", userProfileDataList.getContent());
		return gson.toJson(map);
	}
}
