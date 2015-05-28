package com.jeromejaglale.service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jeromejaglale.domain.Car;

@Service
public class CarService {
	private List<Car> carList = new LinkedList<Car>();
	
	CarService() {
		Car car1 = new Car();
		car1.setName("Mercedes SL");
		car1.setPrice(new BigDecimal(123400));
		carList.add(car1);
		
		Car car2 = new Car();
		car2.setName("BMW M6 Coupé");
		car2.setPrice(new BigDecimal(125000));
		carList.add(car2);

		Car car3 = new Car();
		car3.setName("Audi R8");
		car3.setPrice(new BigDecimal(136100));
		carList.add(car3);
	}
	
	public List<Car> findAll() {
		return carList;
	}
	
	public void add(Car car) {
		carList.add(car);
	}
}
