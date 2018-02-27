package multiThreads;

public class ExampleExtendThread extends Thread{
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
		// TODO Auto-generated method stub
		ExampleExtendThread obj1 = new ExampleExtendThread();
		ExampleExtendThread obj2 = new ExampleExtendThread();
		obj1.start();
		obj2.start();
	}
	/*
	 * 	TODO Presentation
	 * Basics Threads
	 * Definition
	 * How to create thread
	 * 1) Creating Thread with Extends
	 * 2) Creating Thread with Implementing Runnable interfaceDemo
	 * 3) Creating Thread with Anonymous Object by using Runnable interfaceDemo
	 * */
}
