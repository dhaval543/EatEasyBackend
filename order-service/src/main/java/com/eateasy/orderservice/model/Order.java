package com.eateasy.orderservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String foodItem;
    private int quantity;
    private double price;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate = new Date();

    private String status; // PENDING, COMPLETED, CANCELLED
}
