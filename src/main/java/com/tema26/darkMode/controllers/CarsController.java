package com.tema26.darkMode.controllers;

import com.tema26.darkMode.models.Cars;
import com.tema26.darkMode.services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarsService carsService;

    @GetMapping
    public List<Cars> getAllCars(){
        return carsService.getAllCars();
    }

    @PostMapping
    public Cars CreateCar(Cars car){
        return carsService.saveCar(car);
    }
}
