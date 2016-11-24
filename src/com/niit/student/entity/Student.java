package com.niit.student.entity;

public class Student {
private int id;
private String name;
private String address;
private int standard;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
private int rollNo;
public Student(int id, String name, String address, int standard, int rollNo) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.standard = standard;
	this.rollNo = rollNo;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", standard=" + standard + ", rollNo="
			+ rollNo + "]";
}

}
