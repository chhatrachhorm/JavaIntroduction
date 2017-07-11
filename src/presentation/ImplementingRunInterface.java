package presentation;

public class ImplementingRunInterface implements Runnable{
// TODO the run method has to be defined
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello, I am a Thread, by using Runnable Interface");
		}
	}
	public static void main(String[] args) {
		// TODO instantiate the object of ImplementingRunInterface class
		ImplementingRunInterface i = new ImplementingRunInterface();
		// TODO instantiate the object of Thread Class
		Thread t = new Thread(i);
		t.start();

	}

}
