package com.kodtodya.practice;

import com.kodtodya.practice.config.AppConfig;
import com.kodtodya.practice.model.Address;
import com.kodtodya.practice.model.City;
import com.kodtodya.practice.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static ApplicationContext context;
    public static void main( String[] args ) {
        City city = City.builder().name("pune").build();
        Address address = Address.builder().city(city).build();
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = context.getBean("helloService", HelloService.class);

        helloService.setName("xyz");
        helloService.setAddress(address);

        helloService.sayHello();
    }
}
