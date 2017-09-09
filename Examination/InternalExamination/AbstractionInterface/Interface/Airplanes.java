package InternalExamination.AbstractionInterface.Interface;

public interface Airplanes{
    // constant by default
    String NAME = "Airplanes Interface";

    // needed to be overridden
    void run();
    void repair();
    void onStartEngine();
    boolean check();
    void showAirplaneInfo();
    default void callRepairer(){
        System.out.println("Please come and fix");
    }


    // cannot be overridden;
    static void printInfo(){
        System.out.println("This interface name is "+NAME);
    }


}
