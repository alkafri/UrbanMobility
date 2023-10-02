package com.urbanmobility.model;

import jakarta.persistence.*;

@Entity
public class TransportationRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departurePlace;
    private String arrivalPlace;
    private String transportationType;
    private double price;

    // Constructor
    public TransportationRoute() {
    }

    public TransportationRoute(String departurePlace, String arrivalPlace, String transportationType, double price) {
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.transportationType = transportationType;
        this.price = price;
    }

    // Getter and Setter methods for all fields
    // id, departurePlace, arrivalPlace, transportationType, price

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
