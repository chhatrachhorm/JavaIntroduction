package InternalExamination.AbstractionInterface.Interface;

public class Boeing implements Airplanes {
    private String MODEL = "BOEING Jet";
    @Override
    public void run() {
        System.out.println(MODEL + " is running now...");
    }

    @Override
    public void repair() {
        System.out.println(MODEL + " is being fixed now...");
    }

    @Override
    public void onStartEngine() {
        System.out.println(MODEL + " is starting its engine now...");
    }

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void showAirplaneInfo() {
        System.out.println("The plane model is "+MODEL);
    }

    @Override
    public void callRepairer() {

    }
    public static void main(String[] args) {
        Boeing b = new Boeing();
        b.callRepairer();
        b.check();
        b.repair();
        b.onStartEngine();
        b.showAirplaneInfo();
        b.run();
        // accessing static methods in interface
        Airplanes.printInfo();
        System.out.println(Airplanes.NAME);

    }

}
