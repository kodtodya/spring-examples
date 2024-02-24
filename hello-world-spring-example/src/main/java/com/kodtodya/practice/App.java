package com.kodtodya.practice;

import com.kodtodya.practice.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        HelloService helloService = new HelloService();
//        helloService.setName("Pune");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //HelloService helloService = (HelloService) context.getBean("helloService");
        HelloService helloService = context.getBean("helloService", HelloService.class);

        helloService.sayHello();
    }
}
