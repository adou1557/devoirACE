package ma.xproce.carproj.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter

@Entity
@Builder
@ToString

public class Car {
    public Car(Long id, String model, String color, String matricul, Double price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String color;
    private String matricul;
    private Double price;


    public Car() {
    }

}
