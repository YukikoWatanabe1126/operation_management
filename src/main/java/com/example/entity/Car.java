package com.example.entity;

import java.util.List;

public class Car {

    private Integer id;
    private String name;
    private Integer passengers;
    private Driver driver;
    private List<Customer> customers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    public List<Customer> getCustomers(){
    	return customers;
    }
    
    public void setCustomers(List<Customer> customers) {
    	this.customers = customers;
    }
}