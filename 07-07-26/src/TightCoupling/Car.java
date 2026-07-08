package TightCoupling;

public class Car {
    private DieselEngine engine;

    public Car() {
        engine = new DieselEngine(); // Tight coupling
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}