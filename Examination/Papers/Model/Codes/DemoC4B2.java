package Papers.Model.Codes;

public class DemoC4B2 {
        private synchronized void startGoing(){
            System.out.println("Leaving home for the airport");
            System.out.println("Reach the airport...Flying now");
            try{
                wait();
            }catch (Exception e){e.printStackTrace();}
            System.out.println("Reached Malaysia");
        }
        private synchronized void welcomeToMalaysia(){
            try{
                wait();
            }catch (Exception e){e.printStackTrace();}
            System.out.println("Welcome to Malaysia");
        }
        private synchronized void startJourney(){
            int i = 0;
            try{
                Thread.sleep(100);
            }catch (Exception e) {e.printStackTrace();}
            do{
                i++;
            }while(i != 1005);
            notifyAll();
        }
        public static void main(String[] args){
            DemoC4B2 obj = new DemoC4B2();
            Thread chhatra = new Thread(new Runnable() {
                @Override
                public void run(){obj.startGoing();}
            });
            Thread local= new Thread(new Runnable() {
                @Override
                public void run(){obj.welcomeToMalaysia();}
            });
            Thread flying = new Thread(new Runnable() {
                @Override
                public void run(){obj.startJourney();}
            });
            chhatra.start();
            local.start();
            flying.start();
            try{
                chhatra.join();
                local.join();
                flying.join();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Arrived Safe and Sound");
        }

}
