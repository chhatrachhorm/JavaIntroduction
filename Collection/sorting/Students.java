package sorting;
/*
 * NB. if the class is used as an user-defined data type, 
 * then four important things are necessary to be defined:
 * 		1) implement the Comparable interface and the compareTo()
 * 			(or) implement the comparator interface and the compare()
 * 		2) define toString()
 * 		3) define Constructor
 * 		4) define hashCode()
 *	 	5) define equal()
 * */

public class Students implements Comparable<Students>{
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
	@Override
	public int compareTo(Students obj){
		return id-obj.id;
		/*
		 * compareTo is used to help the Collection.sort();
		 * to tell JVM what variable that sort should be based on
		 * for String: the return statement is :
		 * return name.compareTo(obj.name);
		 * because name is in String Class, .compareTo(obj.name) is invoked from string class to compare 2 string
		 * */
	}
	public Students(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		/*
		* hashCode() is used to tell JVM to apply hashcode correctly to user defined dataType based on the variables defined
		* */
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		/*
		* equals() is used to help in comparing two objects based on hashCode
		* */
	}

}
