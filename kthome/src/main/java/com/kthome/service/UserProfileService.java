package com.kthome.service;

import com.kthome.jpa.entity.UserProfile;

public interface UserProfileService {

	public UserProfile findByUserId(String id);
}
