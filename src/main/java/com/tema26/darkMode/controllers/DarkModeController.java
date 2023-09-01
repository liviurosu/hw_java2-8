package com.tema26.darkMode.controllers;

import com.tema26.darkMode.dtos.CarsDTO;
import com.tema26.darkMode.dtos.DarkModeDTO;
import com.tema26.darkMode.dtos.ResponseDTO;
import com.tema26.darkMode.services.DarkModeService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DarkModeController {

    @Autowired
    DarkModeService darkModeService;

//    @Autowired
//    public DarkModeController(DarkModeService darkModeService) {
//        this.darkModeService = darkModeService;
//    }

    @GetMapping("/cars")
    public ResponseDTO getCars(@CookieValue(name = "darkmode", required = false) Boolean darkModePreference) {
        boolean darkMode = darkModePreference != null ? darkModePreference : false;
        List<CarsDTO> cars = darkModeService.getCarsDTO();

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setDarkMode(darkMode);
        responseDTO.setCars(cars);

        return responseDTO;
    }

    @PutMapping("/dark-mode")
    public ResponseEntity<Void> setDarkMode(@RequestBody DarkModeDTO darkModeDTO, @CookieValue(name = "darkmode") String cookieValue) {
        darkModeService.setDarkMode(darkModeDTO.isDarkMode());
        HttpHeaders headers = new HttpHeaders();
        headers.add("Set-Cookie", "darkmode=" + darkModeDTO.isDarkMode());
        return ResponseEntity.ok().headers(headers).build();

    }

}
