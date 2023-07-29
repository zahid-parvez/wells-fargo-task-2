package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String name;
    private String address;
    private String contactInfo;

    @ManyToOne
    private FinancialAdvisor advisor;

    // Constructors, getters, and setters
    // Omitting setters for the id field as it's auto-generated

    // Constructors, getters, and setters
    public Client() {
    }

    public Client(String name, String address, String contactInfo, FinancialAdvisor advisor) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.advisor = advisor;
    }

    // Getters and setters

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }
}
