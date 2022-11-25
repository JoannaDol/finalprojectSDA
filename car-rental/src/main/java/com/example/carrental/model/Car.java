package com.example.carrental.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String colour;
    private String type;
    private String gear;
    private String description;

    public Car(String brand, String model, String colour, String type, String gear, String description) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.gear = gear;
        this.description = description;
    }
}
