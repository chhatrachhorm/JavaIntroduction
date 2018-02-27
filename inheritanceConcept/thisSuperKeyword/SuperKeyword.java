package thisSuperKeyword;

public class SuperKeyword extends ClassA{

	int rno;
	String name;
	public SuperKeyword(){
		super(1000, "XYZ"); 
		/*
		 * use " super " keyword is used to invoke the constructor of the BaseClass(ClassA)
		 * if the base class has one or more constructor(s), super keyword is needed to be used to prevent errors
		 * */
		this.rno = super.rno;
		this.name = super.name;
		System.out.println("Hello From Child Class");
	}
	public void print(){
		System.out.println(rno);
		System.out.println(name);
	}
	public static void main(String[] args) {
		SuperKeyword sp = new SuperKeyword();
		sp.print();

	}

}
