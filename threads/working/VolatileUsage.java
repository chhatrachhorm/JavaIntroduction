package working;

import java.util.Scanner;

public class VolatileUsage extends Thread{

	//boolean status = true;
	volatile boolean status = true;
	/*
	 * volatile is used to make thread refers to that variable every time it execute
	 * */
	public void run(){
		while(status){
			try {
				Thread.sleep(1000);
				System.out.println("Hello");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void stopLoop(){
		this.status = false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		VolatileUsage t = new VolatileUsage();
		t.start();
		System.out.print("Enter any Character to stop: ");
		try(Scanner s = new Scanner(System.in)){
			a = s.next().charAt(0);
		}
		//Do not forget to click enter to give input
		t.stopLoop();
		System.out.println("The thread stopped working because you have entered: "+a);
	}

}
