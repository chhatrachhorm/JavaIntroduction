package Papers.Model.codes.demoB4;

public class Lexus extends MyCars{
    @Override
    public boolean onStartEngine(){
        System.out.println("The car engine is started");
        return true;
    }
    public static void main(String args[]){
        if(new Lexus().onStartEngine()){
            new Lexus().showInfo();
            System.out.println("Let's go");
        }
    }
}
