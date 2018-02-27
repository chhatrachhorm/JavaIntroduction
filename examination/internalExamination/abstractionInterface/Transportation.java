package internalExamination.abstractionInterface;

import internalExamination.abstractionInterface.abstraction.Cars;
import internalExamination.abstractionInterface.interfaceDemo.Airplanes;

public class Transportation extends Cars implements Airplanes{

    @Override
    public void drive() {

    }

    @Override
    public void repairCar() {

    }

    @Override
    public void run() {

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
}
