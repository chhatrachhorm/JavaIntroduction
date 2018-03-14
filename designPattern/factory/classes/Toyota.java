package factory.classes;

import factory.interfaces.Car;

public class Toyota implements Car {
    @Override
    public void start() {
        System.out.println("Starting Toyota");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Toyota");
    }
}
