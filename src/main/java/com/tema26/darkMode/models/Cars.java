package com.tema26.darkMode.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    Integer id;

    private String name;

    private String model;

    private String serialNumber;

    private Integer stock;



}
