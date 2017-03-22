package com.kthome.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kthome.entity.UserProfile;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, String> {

}
