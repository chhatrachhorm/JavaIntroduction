package InternalExamination.thread;

public class demo extends Thread{
    @Override
    public void run(){
        System.out.println("Running now");
    }

    public static void main(String[] args) {
        demo t = new demo();
        t.start();
        Thread t2 = new Thread(new demo());
        t2.start();
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("I am running now");
            }
        });
        t3.start();
    }
    public static class RunnableInterface implements Runnable{
        @Override
        public void run(){
            System.out.println("I am running by Runnable");
        }

        public static void main(String[] args) {
            Thread tk = new Thread(new RunnableInterface());
            tk.start();
        }

    }

}
