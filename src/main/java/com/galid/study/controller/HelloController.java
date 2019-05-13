package com.galid.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.galid.study.dto.student.StudentDto;
import com.galid.study.service.StudentService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	private StudentService studentService;
	
	@PostMapping("/student")
	@ResponseBody
	public String student(@RequestBody StudentDto dto) {
		studentService.save(dto);
		return dto.toString();
	}
	
	@GetMapping("/list")
	@ResponseBody
	public String getList() {
		return studentService.list(); 		
	}
}
