package com.library;

public class Book {
	private int id;
	private String name;
	private String sub;
	private int reg;
	private String publisher;
	private String author;
	public Book(int id, String name, String sub, int reg, String publisher, String author) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
		this.reg = reg;
		this.publisher = publisher;
		this.author = author;
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
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
