package com.kodtodya.practice;

import com.kodtodya.practice.model.Address;
import com.kodtodya.practice.model.City;
import com.kodtodya.practice.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        HelloService helloService = context.getBean("helloService", HelloService.class);
        helloService.setName("Pankaj");
        helloService.setAddress(new Address(City.builder().name("Mumbai").build()));

        helloService.sayHello();
    }
}
