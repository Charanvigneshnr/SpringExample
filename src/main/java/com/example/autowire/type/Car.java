package com.example.autowire.type;

public class Car {
    private Specification specification;

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
