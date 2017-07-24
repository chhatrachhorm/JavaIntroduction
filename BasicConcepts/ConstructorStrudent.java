/*
 * Overloading Constructor-static polymorphism
 * */
public class ConstructorStrudent {
	int id;
	String name;
	ConstructorStrudent(int id1, String name1){
		id = id1;
		name = name1;
		System.out.println("Constructor has been invoked from "+name);
	}
	ConstructorStrudent() {
		id = 0000;
		name = "Anonymous";
		System.out.println("Constructor has been invoked from " + name);
	}

	public static void main(String[] args) {
		ConstructorStrudent s1 = new ConstructorStrudent(1021, "Tra");
		ConstructorStrudent s2 = new ConstructorStrudent();
		
	}

}
