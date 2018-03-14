package factory.producer;

import factory.classes.BMW;
import factory.classes.Lexus;
import factory.classes.Toyota;
import factory.interfaces.Car;

public class CarFactory {
    public Car getCarInstance(String type){
        switch (type.toLowerCase()){
            case "bmw":
                return new BMW();
            case "lexus":
                return new Lexus();
            case "toyota":
                return new Toyota();
            default:
                return null;
        }
    }
}
