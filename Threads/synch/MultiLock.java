package synch;
import java.util.ArrayList;
/*
 * MulitLocks must be implemented with raw objects with synchronized keywords
 * The real scenarios here are:
 * 	1) If any of the functions of the class has implemented with synchronized keyword,
 * 	   then the entire object of that class will be locked once a thread come.
 *  	-> Other thread cannot access any of the function if the object is locked, although other functions are not implemented with synchronized.
 * 	2) To solve this problem, one or more number of raw object must be implemented as the lock object
 * 	   for each any every function that intended to be locked.
 * 	3) synchronized block with the raw object to lock each function as the different object must be used
 * */
public class MultiLock implements Runnable{

	public void run(){
		process();
	}
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	//List list = new ArrayList();
	static ArrayList list1 = new ArrayList();
	static ArrayList list2 = new ArrayList();
	public static void addList1(){
		synchronized (lock1){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(1);
		}

	}
	public static void addList2(){
		synchronized (lock2){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(1);
		}
	}
	public static void process(){
		for(int i = 0; i < 1000; i++){
			addList1();
			addList2();
		}
		
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		MultiLock r1 = new MultiLock();
		MultiLock r2 = new MultiLock();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("size of arraylist 1 : " + list1.size());
		System.out.println("size of arraylist 2 : " + list2.size());
		System.out.println("Time to execution: " + (end-start));
		
	}

}
