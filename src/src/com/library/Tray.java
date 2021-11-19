package com.library;

import java.util.List;

public class Tray {
	private List<Book> book;
	private List<Student> students;
	private int cupboardList;
	private int occupiedList;
	private int unoccupiedList;
	public Tray(List<Book> book, List<Student> students) {
		this.book = book;
		this.students = students;
		cupboardList=100;
		occupiedList=0;
		unoccupiedList=0;
	}
	public List<Book> getBook() {
		return book;
	}
	public void updateBook(Book book) {
		this.book.add(book);
	}
	public List<Student> getStudents() {
		return students;
	}
	public void updateStudents(Student students) {
		this.students.add(students);
	}
	public int getCupboardList() {
		return cupboardList;
	}
	public void updateCupboardList(int cupboardList) {
		cupboardList+= cupboardList;
	}
	public int getOccupiedList() {
		return occupiedList;
	}
	public void updateOccupiedList(int occupiedList) {
		occupiedList += occupiedList;
	}
	public int getUnoccupiedList() {
		return unoccupiedList;
	}
	public void updateUnoccupiedList(int unoccupiedList) {
		unoccupiedList += unoccupiedList;
	}

	
}
