package factory;

import factory.producer.CarFactory;
import factory.interfaces.Car;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Please Enter the Type of the car (BMW, Lexus, Toyota)");
            String type = s.nextLine();
            CarFactory factory = new CarFactory();
            Car car = factory.getCarInstance(type);
            if (car != null){
                car.start();
                car.stop();
            } else {
                System.out.println("Please Specify the type of the car correctly");
            }
        }
    }
}
