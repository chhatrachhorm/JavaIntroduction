package multiThreads;

public class ThreadCreation extends Thread{
 
	
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Hello :"+(i+1));
		}

	}
	/*
	 * Ways to o create threads:
	 * 1)extending from Thread class
	 * 2)implementing runnable interface
	 * 3)anonymous class
	 * */
	public static void main(String[] args) {
		ThreadCreation t1 = new ThreadCreation();
		ThreadCreation t2 = new ThreadCreation();
		ThreadCreation t3 = new ThreadCreation();
		ThreadCreation t4 = new ThreadCreation();
		/*
		 * If we create object from Thread class for example: Thread t = new Thread();
		 * The t object will have only virtual CPU but not the code(run function in thread has only infrastructure)
		 * To pass the code to t object, we have to pass the object that has the code to t object
		 * by using new Thread(new ThreadCreation);
		 * finally it should be: Thread t = new Thread(new ThreadCreation());
		 * */
		Thread t5 = new Thread(new ThreadCreation());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
