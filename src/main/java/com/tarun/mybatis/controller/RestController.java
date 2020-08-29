package com.tarun.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tarun.mybatis.dao.StudentMapper;
import com.tarun.mybatis.domain.Student;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/student")
public class RestController {
	
	@Autowired
	private StudentMapper mapper;
	
	/*
[
  {
    "id": 1,
    "name": "Tarun Kumar Samal",
    "email": "tarunsamal2007@gmail.com"
  },
  {
    "id": 2,
    "name": "naga",
    "email": "naga@huawei.com"
  }
]
	 */
	@GetMapping(value = "/all")
	public List<Student> getAllStudent()
	{
		return mapper.getAllStudent();
	}
	
	@GetMapping(value = "/{id}")
	public Student getStudentbyId(@PathVariable int id)
	{
		return mapper.getStudentbyId(id);
	
	}
	
	@DeleteMapping(value = "delete/{id}")
	public List<Student> deleteStudentbyId(@PathVariable int id)
	{
		 mapper.deleteStudentbyId(id);
		 
		 return mapper.getAllStudent();
	
	}
	
	@PostMapping(value = "/add")
	public List<Student> insertStudent(@RequestBody List< Student> list )
	{

		for(Student student : list)
		{
			mapper.insertStudent(student);
		}
		
		return mapper.getAllStudent();
	}
	
	
	
}
