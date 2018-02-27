package multiThreads;

public class Threads extends Thread{

	@Override
	public void run(){
		System.out.println("Hello From Run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t1 = new Threads();
		t1.start();

	}

}
