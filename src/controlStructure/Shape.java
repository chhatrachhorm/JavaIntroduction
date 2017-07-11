package controlStructure;
public class Shape {
	public static void shape(){
		System.out.println("Please Pass some variables");
	}
	public void shape(float a){
		float s = a*a, p = 4 * a;
		System.out.println("The square has s = "+s+" with the perimeter of "+p);
	}
	public void shape(float a, char c){
		if(c=='r'){
			float s = a*a*(float)Math.PI, p = 2*a*(float)Math.PI;
			System.out.println("The circle has s = "+ s +" with the perimeter of "+p);
		}else if(c=='d'){
			shape(a/2, 'r');
		}
	}
	public void shape(float a, float b){
		float s = a*b, p = 2*(a+b);
		System.out.println("The rectangle has s = "+ s +" with the perimeter of "+p);
	}
	public void shape(float a, float b, float c){
		float s, p;
		s = (float)0.5*a*b*(float)Math.sin((float)Math.toRadians(c));
		p = a + b + (float)Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-4*s/Math.tan(Math.toRadians(c)));
		System.out.println("The triagle has s = "+s+" with the perimeter of "+p);
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		shape();
		s.shape(10, 'r');
		s.shape(5, 'd');
		s.shape(5);
		s.shape(10, 15);
		s.shape(3, 4, 90);
	}
}
