package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Car;

@Mapper
public interface CarMapper {

	public List<Car> findAll(Integer carId, String carName, Integer carPassengers);
	
	public void insert(Car car);
	
	public Car findById(Integer id);
	
	public void update(Car car);
	
	public void deleteById(Integer id);
}
