package com.tema26.darkMode.repositories;

import com.tema26.darkMode.models.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRespository extends JpaRepository<Cars,Integer> {
}
