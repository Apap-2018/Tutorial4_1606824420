package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.CarModel;

/**
 * CarService
 */
public interface CarService {
	void addCar(CarModel car);
	public void deleteById(Long id);
	CarModel getCar(Long id);
}
