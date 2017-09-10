package InternalExamination.thread.Liveness.Deadlock;
/**
* I think the deadlock is the easiest one to understand.
* It happens when a process wait for another one who is using some needed resource
* (ie: file or database table row) to finish with it,
* while the other process also wait for the first process to release some other resource.
 * see greeting for better explanation
* */

public class DeadlockDemo {
    int a = 1;
    int b = 2;
    private int getValA(){return a;}
    private int getValB(){return b;}
    private synchronized void operate1(DeadlockDemo o){
        System.out.println(this.getValA());
        o.operate2();
    }
    private synchronized void operate2(){
        System.out.println(this.getValB());
    }

    public static void main(String[] args) {
        DeadlockDemo o1 = new DeadlockDemo();
        DeadlockDemo o2 = new DeadlockDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                o1.operate1(o2);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                o2.operate1(o1);
            }
        });
        t1.start();
        t2.start();
    }
}
