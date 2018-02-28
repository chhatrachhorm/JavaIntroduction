
public class variableClass {
	static String school;
	String name;
	public static void main(String[] args) {
		variableClass s1 = new variableClass();
		variableClass s2 = new variableClass();
		s1.name="Chhatra";
		s2.name="Derek";
		s1.school="Kirirom Institute of Technology";
		s2.school="EarlyTree";
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.school);
		System.out.println(s2.school);
		/*
		 * For instance variable, each object has its own copy(It is created during executing time in JVM)
		 * For static variable, only a copy of the variable will be made and it will be shared by all the objects(it's created when the class is loaded to JVM)
		 * */
		

	}

}
