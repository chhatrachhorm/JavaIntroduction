package presentation;

public class ExtendingThreadClass extends Thread{
	// TODO override the run method
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello, I am a Thread");
		}
	}
	public static void main(String[] args) {
	// TODO instantiate the object of ExtendingThreadClass
		ExtendingThreadClass t = new ExtendingThreadClass();
		t.start();
	}

}
