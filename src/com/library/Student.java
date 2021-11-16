package com.library;

public class Student {
	
	private int id;
	private String name;
	private String dept;
	private int sec;
	public Student(int id, String name, String dept, int sec) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sec = sec;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	

}
