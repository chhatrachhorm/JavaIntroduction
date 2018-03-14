package factory.classes;

import factory.interfaces.Car;

public class Lexus implements Car {
    @Override
    public void start() {
        System.out.println("Starting Lexus");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Lexus");
    }
}
