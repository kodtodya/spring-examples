package com.kodtodya.practice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private String password;
    private String address;
    private boolean receivePaper;
    private String[] favoriteFrameworks;
    private String gender;
    private String favoriteNumber;
    private String country;
}