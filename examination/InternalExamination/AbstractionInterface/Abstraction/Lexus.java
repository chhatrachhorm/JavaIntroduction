package internalExamination.abstractionInterface.abstraction;

public class Lexus extends Cars {

    @Override
    public void drive() {
        System.out.println("Your car is running");
    }

    @Override
    public void repairCar() {
        System.out.println("Your car has been fixed");
    }
    // reference of an abstract class
//    Cars c = new Cars() {
//        @Override
//        void run() {
//
//        }
//
//        @Override
//        void repair() {
//
//        }
//    };
    public static void main(String args[]){
        // override the Constant in Cars for Lexus
        Lexus.LICENSE_ID = "L12546";
        Lexus.CARS_MODEL = "Lexus RX 470";

        // accessing static method in Lexus, Cars
        Lexus.selling();
        Cars.selling();

        // Accessing non-static methods
        Lexus l = new Lexus();
        l.printMyCarInfo();
        l.drive();
        l.repairCar();
    }

}
