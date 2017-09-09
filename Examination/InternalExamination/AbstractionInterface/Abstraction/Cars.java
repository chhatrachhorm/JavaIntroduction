package InternalExamination.AbstractionInterface.Abstraction;

public abstract class Cars {
    public static String CARS_MODEL;
    public static String LICENSE_ID;
    public abstract void drive();
    public abstract void repairCar();
    public static void selling(){
        System.out.println("Your car("+LICENSE_ID+") is sold");
    }
    public void printMyCarInfo(){
        System.out.println("Your car model is "+CARS_MODEL+" with license id "+LICENSE_ID);
    }

}
