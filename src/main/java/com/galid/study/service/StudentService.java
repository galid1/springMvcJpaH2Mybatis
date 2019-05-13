package com.galid.study.service;

import org.springframework.stereotype.Service;

import com.galid.study.domain.student.StudentRepository;
import com.galid.study.dto.student.StudentDto;
import com.galid.study.mybatis.mapper.StudentMapperImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentService {	
	private StudentRepository repository;

	public void save(StudentDto dto){
		repository.save(dto.toEntity());
	}
	
	private StudentMapperImpl studentMapper;
	
	public String list() {
		StringBuilder builder = new StringBuilder();
		studentMapper.studentList().forEach(v -> builder.append(v.getName() + "\n"));
		return builder.toString();
	}
}
