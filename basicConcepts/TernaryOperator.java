
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b = 20, c=15, d;
		d = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The biggest value is "+d);
	}

}
