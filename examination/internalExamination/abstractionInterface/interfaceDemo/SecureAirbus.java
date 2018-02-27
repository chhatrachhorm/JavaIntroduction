package internalExamination.abstractionInterface.interfaceDemo;

import java.io.IOException;

public class SecureAirbus implements Airplanes {
    @Override
    public void run() {
        System.out.println("KEY 1");
    }

    @Override
    public void repair() {

    }

    @Override
    public void onStartEngine() {

    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void showAirplaneInfo() {

    }

    @Override
    public void callRepairer() {

    }

    public static void main(String[] args) {
        /*
        * Instead of creating object for this class, create object reference for the interface to hide data
        * or the implementation of the run() function for example
        * */

        // less secure way :
        SecureAirbus s = new SecureAirbus();
        s.run();

        // secure way :
        Airplanes a = new SecureAirbus();
        a.run();
        // Runtime Class Example
        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
