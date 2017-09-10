package InternalExamination.thread.Liveness.Deadlock;
/**
* I think the deadlock is the easiest one to understand.
* It happens when a process wait for another one who is using some needed resource
* (ie: file or database table row) to finish with it,
* while the other process also wait for the first process to release some other resource.
* */

public class DeadlockDemo {
    static int a = 1;
    static int b = 2;
    private synchronized static void operate1(){
        System.out.println(a);
        operate2();
    }
    private synchronized static void operate2(){
        System.out.println(b);
        operate1();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                operate1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                operate2();
            }
        });
        t1.start();
        t2.start();
    }
}
