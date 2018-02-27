package thisSuperKeyword;

public class ClassA {
	int rno;
	String name;
	ClassA(int rno, String name){
		/*
		 * rno is assigned to rno
		 * name is assigned to name 
		 * */
//		rno = rno;
//		name = name;
		/*
		 * Use "this" to make rno(local) assign value to rno object(current object)
		 * */
		this.rno = rno;
		this.name = name;
		System.out.println("Hello from Parent Class");
	}
	public void print(){
		System.out.println(rno);
		System.out.println(name);
	}
	public static void main(String[] args) {
		ClassA ca = new ClassA(100, "ABC");
		ca.print();
	}

}
