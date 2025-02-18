package car.example.setter.injection;

public class Car {
    private Specification specification;


    public void getSpecification() {
        System.out.println(specification.toString());
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void setSpecs(String make, String model) {
        specification.setMake(make);
        specification.setModel(model);
    }
}
