package com.tema26.darkMode.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private boolean darkMode;
    private List<CarsDTO> cars;

}
