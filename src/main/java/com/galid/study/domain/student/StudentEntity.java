package com.galid.study.domain.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "student")
@Builder
@AllArgsConstructor
@Getter
public class StudentEntity {
	@Id
	@GeneratedValue
	private Long id;	
	private String name;
	private int age;	
}
