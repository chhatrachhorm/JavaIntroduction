package Papers.Model.codes.demoB4;

public abstract class MyCars {
    private static int create = 1710;
    abstract boolean onStartEngine();
    public void showInfo(){
        System.out.println("The first car was created in " + create);
    }
}
