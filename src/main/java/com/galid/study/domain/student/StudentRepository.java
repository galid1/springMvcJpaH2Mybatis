package com.galid.study.domain.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class StudentRepository {
	private EntityManager manager;
	private EntityTransaction transaction;	
	
	public void save(StudentEntity entity) {
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
