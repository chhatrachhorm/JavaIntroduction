package Papers.Model.codes;

public class DemoC4B1 implements Runnable{
        @Override
        public void run(){
            for(int i = 0; i < 100; i++)
                increase();
        }
        private volatile int data = 0;
        private synchronized void increase(){
            data++;
        }
        public static void main(String args[]){
            DemoC4B1 obj = new DemoC4B1();
            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj);
            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Consistent Value of the data " + obj.data);
        }
}
