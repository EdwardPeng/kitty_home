package com.kthome.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kthome.jpa.entity.UserProfile;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, String> {

	public UserProfile findByUserId(String userId);
}
