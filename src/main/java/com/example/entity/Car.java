package com.example.entity;

public class Car {

	private int id;
	private String name;
	private int passengers;

	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassengers(Integer passenger) {
		this.passengers = passenger;
	}
}