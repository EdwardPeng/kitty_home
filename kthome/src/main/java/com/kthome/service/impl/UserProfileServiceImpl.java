package com.kthome.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kthome.jpa.entity.UserProfile;
import com.kthome.jpa.repository.UserProfileRepository;
import com.kthome.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public UserProfile findByUserId(String id) {
		return userProfileRepository.findByUserId(id);
	}

	@Transactional
	@Override
	public void saveOrUpdate(UserProfile userProfile) {
		userProfileRepository.save(userProfile);
	}
}
