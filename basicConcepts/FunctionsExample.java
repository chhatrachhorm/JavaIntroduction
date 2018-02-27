
public class FunctionsExample {

	public void demo(){
		System.out.println("I'm a default function");
	}
	public void demo(int a){
		System.out.println("I'm a function with one arg a = "+a);
	}
	public void demo(char ch){
		System.out.println("I'm a function with char arg ch = "+ch);
	}
	public void demo(int a, char ch){
		System.out.println("I'm a function with char arg ch = "+ch+" and int a = "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsExample obj = new FunctionsExample();
		obj.demo();
		obj.demo('A');
		obj.demo(100);
		obj.demo(300, 'C');

	}
}
