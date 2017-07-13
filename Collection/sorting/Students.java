package sorting;
/*
 * NB. if the class is used as an user-defined data type, 
 * then two important things are necessary to be defined:
 * implementation of Comparable interface and the compareTo() 
 * (or) implementation of comparator interface and the compare()
 * defining toString();
 * */

public class Students implements Comparable<Students>{

	@Override
	public int compareTo(Students obj){
		return id-obj.id;
		/*
		 * for String: the return statement is : 
		 * return name.compareTo(obj.name);
		 * because name is in String Class, .compareTo(obj.name) is invoked from string class to compare 2 string
		 * */
	}
	/*
	 * When: Collections.sort(list); is called
	 * And: the objects of list will be separated into s1 s2 s3
	 * And: s1.compareTo(s2) will be invoked
	 * Then: the sorting operation will be performed based on the customization of the overridden codes
	 * id is the id of s1 and obj.id is the id of object s2
	 * NB. the customization(what variable to compare) will be done by the programmer
	 * other parts like how to compare with the return value (-, +, 0) will be performed by Collections.sort()
	 * */
	Integer id;
	String name;
	public Students(int id,String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return id+" : "+name;
	}
	/*
	 * toString() is to make the java object printable
	 * simply define the function and when the object is printed, then the toString() will be invoked
	 * e.g. 
	 * Students object = new Students(123, "John");
	 * System.out.println(object);
	 * */

}
