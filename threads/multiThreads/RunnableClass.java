package multiThreads;

public class RunnableClass implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++){
			System.out.println("Hello From Implemetation Runnable Class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableClass rnc = new RunnableClass();
		AnotherClassRunnable anc = new AnotherClassRunnable();
		Thread t1 = new Thread(new RunnableClass());
		Thread t2 = new Thread(rnc);
		Thread t3 = new Thread(anc);
		/*
		 * Private the function for t4
		 * */
		Thread t4 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i < 10; i++){
					System.out.println("Hello From Private Function of T4");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		/*
		 * rnc.start(); -> will throw an error, because RunnableClass hasn't extends from ThreadClass
		 * */
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}


}
