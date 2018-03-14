package factory.classes;

import factory.interfaces.Car;

public class BMW implements Car {
    @Override
    public void start() {
        System.out.println("Starting BMW");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MBW");
    }
}
