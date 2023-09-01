package com.tema26.darkMode.services;

import com.tema26.darkMode.dtos.CarsDTO;
import com.tema26.darkMode.models.Cars;
import com.tema26.darkMode.repositories.CarsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DarkModeService {

    @Autowired
    CarsRespository carsRespository;

    private boolean darkMode = false;

    private CarsDTO convertToCarDTO(Cars car) {
        CarsDTO carsDTO = new CarsDTO();
        carsDTO.setName(car.getName());
        carsDTO.setModel(car.getModel());

        return carsDTO;
    }

    public List<CarsDTO> getCarsDTO() {
        List<Cars> cars = carsRespository.findAll();
        return cars.stream()
                .map(this::convertToCarDTO)
                .collect(Collectors.toList());
    }
    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }


}


