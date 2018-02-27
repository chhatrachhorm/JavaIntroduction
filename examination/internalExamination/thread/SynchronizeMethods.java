package internalExamination.thread;
/**
* Multiple processes in one field
* */
public class SynchronizeMethods {
    private static int val=0;
    private synchronized static void increase(){
        val++;
    }
    private synchronized static void decrease(){
        val--;
    }
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        Thread increaseThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<100; i++){
                    increase();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        Thread decreaseThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++){
                    decrease();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        increaseThread.start();
        decreaseThread.start();
        try{
            increaseThread.join();
            decreaseThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("value = "+val+" "+(end-start));
    }


}
