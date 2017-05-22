package com.kthome.jpa.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kthome.jpa.entity.UserProfile;

@Repository
public interface UserProfileRepository extends PagingAndSortingRepository<UserProfile, String>, JpaSpecificationExecutor<UserProfile> {

	public UserProfile findByUserId(String userId);
}
