package com.tarun.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tarun.mybatis.domain.Student;

@Mapper
public interface StudentMapper {
	
	public List<Student> getAllStudent();
	
	public void insertStudent(Student student);
	
	public List<Student> modifyStudent();
	
	public void deleteStudentbyId(int id);
	
	public Student getStudentbyId(int id);

}
