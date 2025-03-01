package com.eateasy.restaurantservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String cuisineType;

    public Restaurant() {}

    public Restaurant(String name, String address, String cuisineType) {
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
    }

    // Getters and Setters
}
