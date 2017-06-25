package mainPackage;

public class ChildSamePackage extends BaseClass {

	@Override
	public void sayHello(){
		System.out.println("Hello From ChildClass");
	}

	public static void main(String[] args) {
		BaseClass bb = new BaseClass();
		bb.sayHello();
		ChildSamePackage cc = new ChildSamePackage();
		cc.sayHello();
		/*
		 * with new Something()
		 * The compiler will postpone the new Something() only the object reference will be created
		 * new Something() will be created during the running time in JVM
		 * */
	}
}
