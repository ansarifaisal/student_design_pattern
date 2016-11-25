package com.niit.student.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.niit.student.dao.StudentDAO;
import com.niit.student.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	private static StudentDAO studentDAO = null;
	public static StudentDAO getStudentDAO() {
		if(studentDAO == null){
			studentDAO = new StudentDAOImpl();
		}
		return studentDAO;
	}
	List<Student> students = null;
	private StudentDAOImpl() {
		students = new ArrayList<>();
		students.add(new Student(1, "Faisal", "Chembur", 5, 101));
		students.add(new Student(2, "Aqib", "Kurla", 5, 102));
		students.add(new Student(3, "Pavan", "Airoli", 5, 103));
		students.add(new Student(4, "Avadoot", "Chembur", 5, 104));
		students.add(new Student(5, "Demo", "Chembur", 5, 105));
	}
	@Override
	public Student getId(int id) {
		for (Student student : students) {
			if(student.getId() == id){
				return student;
			}
		}
		return null;
	}
	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		return students;
	}
	@Override
	public boolean add(Student student) {
		students.add(student);
		return true;
	}
	@Override
	public boolean update(Student student) {
		Student original = null;
		for (Student temp : students) {
			if(student.getId() == temp.getId()){
				original = temp;
				break;
			}
		}
		original.setName(student.getName());
		return true;
	}
	@Override
	public boolean delete(Student student) {
		students.remove(student);
		return true;
	}
	@Override
	public List<Student> getByAddress(String address) {
		List<Student> temp = new ArrayList<>();
		for (Student student : students) {
			if(student.getAddress().equals(address)){
				temp.add(student);
			}
		}
		return temp;
	}
}
