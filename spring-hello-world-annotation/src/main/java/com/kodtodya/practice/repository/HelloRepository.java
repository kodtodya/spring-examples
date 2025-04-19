package com.kodtodya.practice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String greet() {
        return "hello world!";
    }
}
