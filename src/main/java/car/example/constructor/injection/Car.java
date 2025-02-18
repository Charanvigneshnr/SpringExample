package car.example.constructor.injection;

public class Car {
    private final Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void getSpecification() {
        System.out.println(specification.toString());
    }

    public void setSpecification(String make, String model) {
        specification.setMake("Toyota");
        specification.setModel("Camry");
    }
}
