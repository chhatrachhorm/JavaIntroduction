package internalExamination.abstractionInterface.interfaceDemo;

public interface Airplanes{
    // constant by default
    String NAME = "Airplanes interfaceDemo";

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
