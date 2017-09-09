package InternalExamination.thread;

public class CrazyGame {
    private synchronized void walkingHome(){
        System.out.println("Walking home from school...");
        try{
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Yeah, I am home!");
    }
    private synchronized void home(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome Home");
    }
    private synchronized void distance(){
        for(int i = 0; i <50; i++){
            System.out.println("walking...");
        }
        notifyAll();
    }

    public static void main(String[] args) {
        CrazyGame cg = new CrazyGame();
        Thread man = new Thread(new Runnable() {
            @Override
            public void run() {
                cg.walkingHome();
            }
        });
        Thread far = new Thread(new Runnable() {
            @Override
            public void run() {
                cg.distance();
            }
        });
        Thread h = new Thread(new Runnable() {
            @Override
            public void run() {
                cg.home();
            }
        });
        man.start();
        h.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        far.start();
    }

}
