package synch;

public class ThreadSyncClass {

	private int cnt=0;
	public void countTheValue(){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i<1000; i++)
				increment();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i<1000; i++)
				increment();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void increment(){
		// Use synchronized keyword to lock the increment function from other thread if one thread is already call this function
		// If the synchronized keyword is added to the function of a class, then all the object of that class will be locked
		cnt++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSyncClass ct = new ThreadSyncClass();
		ct.countTheValue();
		System.out.println("cnt = " + ct.cnt);
	}

}
