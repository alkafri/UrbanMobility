package com.urbanmobility.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TransportationProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String campaign;

    // Constructors
    public TransportationProvider() {
    }

    public TransportationProvider(String name, String campaign) {
        this.name = name;
        this.campaign = campaign;
    }

    // Getter and Setter methods for all fields
    // id, name, campaign

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }
}
