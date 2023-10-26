package com.example.entity;

public class Car {

	private int id;
	private String name;
	private int passenger;

	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getpassengers() {
		return this.passenger;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setpassengers(Integer passenger) {
		this.passenger = passenger;
	}
}