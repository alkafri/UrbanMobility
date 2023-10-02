package com.urbanmobility.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user; // Reference to the user who made the booking

    private String departurePlace;
    private String arrivalPlace;
    private String transportationType;
    private Date estimatedDeparture;
    private Date estimatedArrival;
    private double price;

    // Constructors, Getter, and Setter methods for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Date getEstimatedDeparture() {
        return estimatedDeparture;
    }

    public void setEstimatedDeparture(Date estimatedDeparture) {
        this.estimatedDeparture = estimatedDeparture;
    }

    public Date getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(Date estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
