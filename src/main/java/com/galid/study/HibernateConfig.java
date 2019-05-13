package com.galid.study;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {
	
	// JPA, H2	
	@Bean
	public EntityManagerFactory entityManagerFactory() {	
		return Persistence.createEntityManagerFactory("jpabook");		
	}
	
	@Bean
	public EntityManager entityManager() {		
		return entityManagerFactory().createEntityManager();
		
	}
	
	@Bean
	public EntityTransaction entityTransaction() {
		return entityManager().getTransaction();
	}

}
