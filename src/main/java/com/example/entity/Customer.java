package com.example.entity;

public class Customer {
	private int id;
	private String name;
	private int carId;

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
	
	public int getCarId() {
		return this.carId;
	}
	
	public void setCarId(int carId) {
		this.carId = carId;
	}
}