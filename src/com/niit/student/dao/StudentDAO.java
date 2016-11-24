package com.niit.student.dao;

import java.util.List;

import com.niit.student.entity.Student;

public interface StudentDAO {
	Student getId(int id);
	List<Student> studentList();
	boolean add(Student student);
	boolean update(Student student);
	boolean delete(Student student);
}
