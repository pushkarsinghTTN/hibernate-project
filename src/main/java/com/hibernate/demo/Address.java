package com.hibernate.demo;
import javax.persistence.*;

@Embeddable
public class Address{
    private String street;
    private String location;
    private String state;
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}