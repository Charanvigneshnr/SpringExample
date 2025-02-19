package com.example.autowire.constructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void getSpecification() {
        System.out.println(specification.toString());
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void setSpecs(String make, String model) {
        specification.setMake("Toyota");
        specification.setModel("Camry");
    }
}
