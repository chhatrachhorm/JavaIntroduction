package Papers.Model.Codes.DemoB4;

public class Boeing implements MyAirplanes{
    @Override
    public boolean onStartEngine(){
        System.out.println("Boeing is started");
        return true;
    }
    @Override
    public boolean onStopEngine(){
        System.out.println("Boeing is stopped");
        return true;
    }
    public static void main(String args[]){
        if(new Boeing().onStartEngine()){
            System.out.println("We are flying");
        }
    }
}
