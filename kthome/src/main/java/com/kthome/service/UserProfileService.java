package com.kthome.service;

import org.springframework.data.domain.Page;

import com.kthome.jpa.entity.UserProfile;

public interface UserProfileService {

	public UserProfile findByUserId(String id);
	
	public void saveOrUpdate(UserProfile userProfile);
	
	public Page<UserProfile> query(String name, String phone, int page, int size);
}
