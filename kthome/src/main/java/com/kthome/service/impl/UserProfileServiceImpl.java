package com.kthome.service.impl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	public Page<UserProfile> query(String name, String phone, int page, int size) {
		Pageable pageable = new PageRequest(page, size, Direction.ASC);
		
		return userProfileRepository.findAll(lastNameIsLike(name), pageable);
	}
	
	public static Specification<UserProfile> lastNameIsLike(final String searchTerm) {
        
        return new Specification<UserProfile>() {
            
            private String getLikePattern(final String searchTerm) {
                StringBuilder pattern = new StringBuilder();
                pattern.append(searchTerm.toLowerCase());
                pattern.append("%");
                return pattern.toString();
            }

			@Override
			public Predicate toPredicate(Root<UserProfile> userProfileRoot, javax.persistence.criteria.CriteriaQuery<?> arg1,
					CriteriaBuilder cb) {
				Predicate predicate = cb.conjunction();
				String likePattern = getLikePattern(searchTerm);
                predicate.getExpressions().add(cb.like(cb.lower(userProfileRoot.<String>get("userName")), likePattern));
                return predicate;
			}
        };
    }
}
