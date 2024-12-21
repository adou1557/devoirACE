package ma.xproce.carproj.dto;

import lombok.*;

@Data
@Builder

public class CarDTO {
    private String model;
    private String color;
    private String matricul;
    private Double price;

    public CarDTO(String model, String color, String matricul, Double price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }

    public CarDTO() {
    }
}
