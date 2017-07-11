package multiThreads;

public class ExampleThreadRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<100; i++){
			System.out.println("Thread ID"+ randomWithRange(1, 1000));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	protected int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	public static void main(String[] args) {
		ExampleThreadRunnable etr = new ExampleThreadRunnable();
		Thread t1 = new Thread(etr);
		t1. start();

	}



}
