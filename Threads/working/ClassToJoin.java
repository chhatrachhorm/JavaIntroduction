package working;

public class ClassToJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i < 3; i++){
					try {
						Thread.sleep(3000);
						System.out.println("Hello from thread 1");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
			);
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0; i < 3; i++){
					try {
						Thread.sleep(3000);
						System.out.println("Hello from thread 2");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
			);
		t1.start();
		try {
			t1.join();
			// make the current thread to wait until another thread(with join()) to complete the execution
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();  
		System.out.println("Hello From the main thread");
	}

}
