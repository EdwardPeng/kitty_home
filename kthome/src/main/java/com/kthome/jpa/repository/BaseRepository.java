package com.kthome.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public class BaseRepository<T, ID>  {

	@PersistenceContext
    private EntityManager em;
	
	public void insert(T entity) {
		em.persist(entity);
	}
}
