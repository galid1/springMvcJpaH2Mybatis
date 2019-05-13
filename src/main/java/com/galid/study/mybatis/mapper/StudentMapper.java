package com.galid.study.mybatis.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.galid.study.dto.student.StudentDto;

public interface StudentMapper {
	@Select("SELECT * FROM STUDENT;")
	ArrayList<StudentDto> studentList();
}
