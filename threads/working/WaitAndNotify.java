package working;

public class WaitAndNotify {

	int goods;
	/*
	 * default value of instance integer and static integer is 0
	 * default value of local integer is null
	 * */
	public synchronized void producer(){
		for(int i = 0; i < 10; i++)
			goods++;
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After waiting... Hello From Producer");
	}
	public synchronized void consumer(){
		for(int i = 0; i<10; i++)
			goods--;
		notify();
		System.out.println("After notifying... Hello From Consumer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final WaitAndNotify w = new WaitAndNotify();
		new Thread(new Runnable(){
			public void run(){
				w.producer();
			}
		}).start();
		new Thread(new Runnable(){
			public void run(){
				w.consumer();
			}
		}).start();
	}

}
