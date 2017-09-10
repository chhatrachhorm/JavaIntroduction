package InternalExamination.AbstractionInterface.Abstraction;
/**
 * public abstract class Bar
 * public abstract returnType foo();
 * public static void foo()
 * public synchronized static returnType foo();
 * public synchronized returnType foo();
 * */

public abstract class Cars {
    // variables
    public static String CARS_MODEL;
    public static String LICENSE_ID;

    // abstract function
    public abstract void drive();
    public abstract void repairCar();

    public static void selling(){
        System.out.println("Your car("+LICENSE_ID+") is sold");
    }
    public void printMyCarInfo(){
        System.out.println("Your car model is "+CARS_MODEL+" with license id "+LICENSE_ID);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public  synchronized static int a(){
        return 1;
    }


}
