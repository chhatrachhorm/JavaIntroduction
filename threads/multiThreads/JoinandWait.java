package multiThreads;

public class JoinandWait {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello from thread 1");
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("hello from t2");
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("middle");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
