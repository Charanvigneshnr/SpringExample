package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        Car car = (Car) context.getBean("myCar");
        car.getSpecification();
        car.setSpecification("Toyota", "Camry");
        car.getSpecification();
    }
}
