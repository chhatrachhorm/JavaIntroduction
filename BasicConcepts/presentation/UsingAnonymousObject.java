package presentation;

public class UsingAnonymousObject{

	public static void main(String[] args) {
		/*
		 * Make an object for Thread Class
		 * Create an object for Runnable class
		 * Define run() method that has the body as you want
		 * */
		Thread t = new Thread(
					new Runnable(){
						public void run(){
							for(int i = 0; i < 5; i++)
								System.out.println("Hello From Anonymous Object");
						}
					}
				);
		t.start();
	}
}



