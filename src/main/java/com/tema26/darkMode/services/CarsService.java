package com.tema26.darkMode.services;

import com.tema26.darkMode.models.Cars;
import com.tema26.darkMode.repositories.CarsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsService {

    @Autowired
    CarsRespository carsRespo;

    public Cars saveCar(Cars c){
        return carsRespo.save(c);
    }
    public ArrayList<Cars> getAllCars(){
        ArrayList<Cars> c = (ArrayList<Cars>) carsRespo.findAll();
        return c;
    }
}
