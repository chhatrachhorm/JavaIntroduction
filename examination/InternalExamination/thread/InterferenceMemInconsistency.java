package internalExamination.thread;

public class InterferenceMemInconsistency {
    private static int a = 0;
    private static void increment(){
        a++;
    }
    private static void decrement(){
        a--;
    }
    private static int getVal(){
        return a;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread increaseThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++){
                    increment();
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }


            }
        });
        Thread decreaseThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<100; i++){
                    decrement();
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
        try {
            decreaseThread.join();
            increaseThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println(getVal() + " " + (end-start));
    }
}
