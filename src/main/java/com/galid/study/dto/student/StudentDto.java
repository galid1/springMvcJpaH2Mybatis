package com.galid.study.dto.student;

import com.galid.study.domain.student.StudentEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class StudentDto {
	private String name;
	private int age;
	
	public StudentEntity toEntity() {		
		return StudentEntity.builder()
				.name(this.name)
				.age(this.age)
				.build();
	}
}
