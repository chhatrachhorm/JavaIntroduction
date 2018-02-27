package inheritance;

public class Child extends BaseClass{
	public static void main(String[] args) {
		BaseClass c = new BaseClass();
		Child d = new Child();
		System.out.println("You just get the inherited value: "+d.Value());
		System.out.println("You just get the inherited value: "+c.Value());
	}

}
/*
 * extends keyword can be use to let the child class extends from the parent class
 * By using the object reference Child d = new Child(); itself (or BaseClass c = new BaseClass();)
 * If the keyword extends is not specified, object reference must be BaseClass c = new BaseClass(); only
 */