package com.kodtodya.practice.model;


public class Address {
    private City city;

    // parameterized constructor
    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
