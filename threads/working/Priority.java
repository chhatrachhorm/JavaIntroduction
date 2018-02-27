package working;

public class Priority{

	public static void main(String[] args) {
		Thread t1 = new Thread(
				new Runnable(){
					public void run(){
						System.out.println("Hello from " + Thread.currentThread().getName());
					}
				});
		t1.setName("Derek Ong");
		Thread t2 = new Thread(
				new Runnable(){
					public void run(){
						System.out.println("Hello from "+Thread.currentThread().getName());
					}
				});
		t2.setName("Abang Ku");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		/*
		 * .stop(); -> stop the thread immediately and it might collapse the program
		 * .shutdown(); -> wait for the thread to finish and then let it push back the resources then JVM will kill the thread progressively
		 * */
	}

}
