package exception;
public class NullPointException {
/*
 * Dummy is a class name
 * */
	public static void callSayHello(Dummy d){
		try{
			d.sayHello();
		}catch(NullPointerException e){
			System.out.println("You have some fraud in the code");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dummy d = null; 
		/*
		 * Dummy d is created an object reference.
		 * */
		callSayHello(d);
	}

}
