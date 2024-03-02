package com.kodtodya.practice.service;

import com.kodtodya.practice.model.Address;
import com.kodtodya.practice.repository.HelloRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    private String name;
    private Address address;

    public void sayHello() {
        helloRepository.sayHello(name, address.getCity().getName());
    }
}
