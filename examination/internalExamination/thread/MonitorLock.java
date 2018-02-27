package internalExamination.thread;
/**
 * Monitor lock or intrinsic lock
 * use when
 * Multiple process in multiple fields (to reduce waiting time)
 */

public class MonitorLock {
    private static int a = 0;
    private static int b = 0;
    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();
    private static void setVal1()throws Exception{
        synchronized(obj1){
            a++;
            Thread.sleep(1);
        }

    }
    private static void setVal2() throws Exception{
        synchronized (obj2){
            b++;
            Thread.sleep(1);
        }
    }
    private static void process(){
       for(int i = 0; i<400; i++){
           try{
               setVal1();
               setVal2();
           }catch (Exception e){
               e.printStackTrace();
           }
       }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("a = " + a + ", b = "+b+" "+(end-start));
    }

}
