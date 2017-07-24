package array;
import java.util.ArrayList;
public class listOfArray {

		//List list = new ArrayList();
		ArrayList list = new ArrayList();
		public void addData(){
			list.add(199.4);
			list.add(1000);
			list.add('A');
			list.add("Hello World");
			System.out.println(list);
			System.out.println(list.size());
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			listOfArray m = new listOfArray();
			m.addData();
		}




}
