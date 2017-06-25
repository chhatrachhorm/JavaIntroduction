package mainPackage;

public class BaseClass {
	final int a;
	static final int b;
	static{
		b = 200;
	}
	public BaseClass(){
		a = 100;
	}
	public int publicVar = 1;
	private int privateVar = 2;
	protected int protectedVar = 3;
	int defaultVar = 4;
	public void sayHello(){
		System.out.println("Hello From BaseClass");
	}
	final public void finalSayHello(){
		System.out.println("Hello From BaseClass");
	}
	public void printPrivate(){
		System.out.println(privateVar);
	}
}
