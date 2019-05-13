package com.galid.study.mybatis.mapper;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galid.study.dto.student.StudentDto;

@Service
public class StudentMapperImpl implements StudentMapper{

	@Autowired
	StudentMapper mapper;
	
	public ArrayList<StudentDto> studentList() {
		return mapper.studentList(); 
	}

}
