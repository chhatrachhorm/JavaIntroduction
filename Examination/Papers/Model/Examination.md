### KIT Core Java Model Examination
#### Part A
1. Responsibilities of JVM are to load the bytecode file, verify that file and to execute it.
2. Difference between String and StringBuffer
    * String is immutable
    * StringBuffer is mutable
3. Platform Independence is the ability of the same program that can be executed regardless of the platform.
    * The advantages of Platform Independence are:
        * WORA concept can be achieved.
        * Save times in writing codes (write once run anywhere)
        * Save Money
4. Differences Between Procedure Oriented and Object Oriented Programming Paradigms
    * POO
        * Follow Top Down Approach
        * No access specifier
        * Subdivided into Functions
        * No Data Hiding-Less Secure
        * Focus on Process and its required Data
    * OOP
        * Follow Bottom Up Approach
        * Has Access Specifier
        * Subdivided into Objects
        * Support Inheritance, Encapsulation, Abstraction and Polymorphism
        * Focus on Data
    [Ref](http://freefeast.info/general-it-articles/difference-between-procedure-oriented-programming-and-object-oriented-programming-procedure-oriented-programming-vs-object-oriented-programming/)
5. Definitions
    * Abstract Function is the function declared with abstract keyword that has only function prototype.
    * Abstract Class is the class declared with abstract keyword that has abstract and concrete functions or a class with partial implementation.
6. In Java, Collections is a framework to collect objects into a single object called package.
7. Difference between HashSet and LinkedHashSet
    * HashSet is a kind of Set in which the order of items are in the random order (no order)
    * LinkedHashSet is a kind of Set in which the items are ordered in the user-defined order. (maintain the insertion order)
8. Thread is a concurrent light-weight process. There are three components of Thread which are
    * Codes to be executed
    * Data to be shared
    * Virtual CPU
9. LifeCycle of a Thread
10. Array is a collection of similar data items stored in contiguous memory locations under a common name. Array is immutable.
```java
// Syntax to create array
// <datatype>[] name = new <datatype>[size];
int[] arr = new int[100];
```
#### Part B
1. Internal Parts of JVM
   1. Class Loader
        * Class Loader is used to load the .class file with the help of bootstrap class loader, extension class loader and application class loader
        * The operations to be performed
            * Bytecode verification
            * Static variable memory allocation
            * Replacement of symbolic memory reference with the original one
            * static block initialization
   2. Runtime Data Area
        * Method Area: store all class level data and static variables
        * Heap Area: store objects and arrays
        * Stack Area: local variable creation (each runtime stack for each thread)
        * PC registration for all the threads: 
        * Native Method Stacks: hold native method information
   3. Execute Engine
        * Execute engine is to execute the byte code from Runtime Data Area
            * Interpreter
            * JIT Compiler
            * Garbage Collector
2. A program to input string for the keyboard, convert it to Character Array, sum the ASCII value and print it
    ```java
           public class StringDemo{
               public static void main(String args[]){
                   try(Scanner s = new Scanner(System.in)){
                       String input;
                       char[] charArr;
                       int total = 0;
                       input = s.nextLine();
                       charArr = input.toCharArray();
                       for(char c: charArr){
                           total += c;
                       }
                       System.out.println("The total ASCII is " + total);
                   }
               }
           }
    ```
3. A program to read data from a text file named mytitle.txt and to print only the special characters and number of it
    ```java
    public class FileReadDemo{
            public static void main(String args[]){
                try{
                    FileInputStream fis = new FileInputStream("Examination/Papers/Model/Codes/mytitle.txt");
                    byte b[] = new byte[1024];
                    int total = 0;
                    fis.read(b);
                    char[] arr = new String(b).trim().replace("\n", "").replace("\r", "").toCharArray();
                    System.out.println("length of array " + arr.length);
                    for(char c: arr){
                        if(!(((int)'A' <= (int)c && (int)c <= (int)'Z') || ((int)'a' <= (int) c && (int)c <= (int)'z') || ((int)'0' <= (int)c && (int)c <= (int)'9'))){
                            System.out.println(c);
                            total++;
                        }
                    }
                    System.out.println("Number of Special Character: " + total);
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
    }
    ``` 
4. Interface and Abstract Class Explanation
    * Interface
        * Interface is a reference type similar to a class that can only contain abstract methods and constants. 
        In Java8, Interface can also contains default and static methods. 
        Interface forms a contract between the class and the outside world which is enforced at build time by the compiler.
        * program to explain
            ```java
            public interface Airplanes{
                int CREATE = 1810;
                String INVENTOR = "2 Brothers";
                boolean onStartEngine();
                boolean onStopEngine();
            }
            public class Boeing implements Airplanes{
                @Override
                public boolean onStartEngine(){
                    System.out.println("Boeing is started");
                    return true;
                }
                @Override
                public boolean onStopEngine(){
                    System.out.println("Boeing is stopped");
                    return true;
                }
                public static void main(String args[]){
                    if(new Boeing().onStartEngine()){
                        System.out.println("We are flying");
                    }
                }
            }
            ```
    * Abstract Class
        * Abstract class is a class with partial implementation or a class that has both abstract methods and concrete methods.
        Abstract class is a blueprint for the normal class. Abstract class cannot be instantiated but it can be subclassed.
        * Program
            ```java
            public abstract class MyCars{
                private static int create = 1710;
                abstract boolean onStartEngine();
                public void showInfo(){
                    System.out.println("The first car was created in " + create);
                }
            }
            public class Lexus extends MyCars{
                @Override
                public boolean onStartEngine(){
                    System.out.println("The car engine is started");
                    return true;
                }
                public static void main(String args[]){
                    if(new Lexus().onStartEngine()){
                        System.out.println("Let's go");
                    }
                }
            }
            ```
5. Map
    * Map is an interface that store key value pairs. The key must not be duplicated if it does, the value will be overwritten.
    * Map advantages are
        * provide a key value pair which is easy to remember (call the key name to get the value)
        * its concepts is used to store values in all kinds of Databases in Java like ContentValue for SQLite and HashMap for firebase realtime database
        * three types of Map : HashMap, LinkedHashMap, TreeMap
    * Distinguish between HashMap and LinkedHashMap and TreeMap
        * HashMap is a kind of map that the items are in random order (no order)
        * LinkedHashMap is a kind of map that items are in the user defined order (maintain the insertion order)
        * TreeMap is a kind of map that items are in the natural order (ASC)
        ```java
        public class MapDemo{
            public static void main(String args[]){
                Map<Integer, String> hMap = new HashMap<>();
                hMap.put(1, "One");
                hMap.put(2, "Two");
                hMap.put(3, "Three");
                System.out.println("HashMap: ", hMap);
                
                Map<Integer, String> lMap = new LinkedHashMap<>();
                lMap.put(1, "One");
                lMap.put(5, "Five");
                lMap.put(2, "Two");
                System.out.println("LinkedHashMap: ", lMap);
                
                Map<Integer, String> tMap = new TreeMap<>();
                tMap.put(8, "Eight");
                tMap.put(6, "Six");
                tMap.put(10, "Ten");
                System.out.println("TreeMap: ", tMap);
            }
        }
        ```
#### Part C
1. Logic Buildings
    * A program to determine the logic
        array [21292, 1345, 32535] => ans[3, 0, 1]
        ```java
        public class TwoLogicArray{
            public static void main(String args[]){
                try(Scanner s = new Scanner(System.in)){
                    int[] input;
                    int[] ans;
                    int size = s.nextInt();
                    input = new int[size];
                    ans = new int[size];
                    System.out.println("Enter the array item");
                    for(int i = 0; i < size; i++){
                        input[i] = s.nextInt();
                    }
                    for(int i=0; i<size; i++){
                        char a[] = Integer.toString(input[i]).toCharArray();
                        int total = 0;
                        for(char c: a){
                            if(c == '2') total++;
                        }
                        ans[i] = total;
                    }
                    System.out.print("Original Array: ");
                    for(int i: input){
                        System.out.print(i + ", ");
                    }
                    System.out.println("\nConverted Array: ");
                    for(int i: ans){
                        System.out.print(i + ", ");
                    }
                }
            }
        }
        ```
    * Program to print the 4 edge values of 5*5 2D array
        ```java
        public class DemoC1B {
            // print surrounding value of 5*5 matrix
            public static void main(String[] args) {
                int input[][] = new int[5][5];
                ArrayList<Integer> ans = new ArrayList<>();
                try(Scanner s = new Scanner(System.in)){
                    for(int i = 0; i < 5; i++)
                        for(int j = 0; j < 5; j++)
                            input[i][j] = s.nextInt();
                }
                int right, bottom, left;
                right = bottom = left = 0;
                for(int i = 0; i<4; i++){
                    if(i==0){
                        for(int j=0; j<5; j++)
                        ans.add(input[0][j]);
                        right = 4; // right col is 4 - 5th
                    }
                    if(i==1){
                        for(int j=0; j<4; j++)
                            ans.add(input[j+1][right]);
                        bottom = 3; // bottom col is 3 - 4th
                    }
                    if(i==2){
                        for(int j = 0; j < 4; j++)
                            ans.add(input[4][bottom - j]);
                        left = 4; // left left is 4 - 5th
                    }
                    if(i==3){
                        for(int j = 1; j<4; j++)
                            ans.add(input[left-j][0]);
                    }
                }
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j < 5; j++){
                        System.out.print(input[i][j] + " ");
                    }
                    System.out.println();
                }
        
                System.out.println(ans);
            }
        }
        ```
2. FileOperation and Serialization
    * Serialization and Deserialization
        * Serialization is a process of converting an object into a sequence of bytes which can be persisted to a storage or can be sent through streams.
        * The reverse process of creating an object from sequence of bytes is called deserialization.
        ```java
        /*Serializable Obj*/
        public class Student implements Serializable{
            private int id;
            private String name;
            public Student(int id, String name){
                this.id = id;
                this.name = name;
            }
            @Override
            public String toString(){return id + ". " + name; }
        }
        ```
        ```java
        /*Serialization*/
        public class KITStudents{
            public static void main(String args[]){
                Student s = new Student(1, "Chhatra Chhorm");
                try{
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Examination/Papers/Model/Codes/StudentObj.bin"));
                    ObjectOutputStream oos = new ObjectOutputStream(bos);
                    oos.writeObject(s);
                    oos.close();
                    bos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        ```
        ```java
        /*Deserialization*/
        public class KITStudentDeSerialize{
            public static void main(String args[]){
                try{
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Examination/Papers/Model/Codes/StudentObj.bin"));
                    ObjectInputStream ois = new ObjectInputStream(bis);
                    Student s = (Student)ois.readObject();
                    System.out.println(s.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        ```
    * FileOperation : A project to perform FileInputStream, BufferedInputStream, FileOutputStream, BufferedOutputStream
        ```java
        public class FileOperationDemo{
            private File f = new File("Examination/Papers/Model/Codes/fileOperationDemo.html");
            public void iFIS() throws IOException{
                    FileInputStream fis = new FileInputStream(f);
                    byte b[] = new byte[1024];
                    fis.read(b);
                    System.out.println("FIS: " + new String(b).trim());
            }
            public void iBIS() throws IOException{
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
                byte b[] = new byte[1024];
                bis.read(b);
                System.out.println("BIS: " + new String(b).trim());
            }
            public void iFOS(String message) throws IOException{
                FileOutputStream fos = new FileOutputStream(f);
                fos.write(message.getBytes());
                fos.close();
            }
            public void iBOS(String message) throws IOException{
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
                bos.write(message.getBytes());
                bos.close();
            }
            public static void main(String args[]){
                FileOperationDemo obj = new FileOperationDemo();
                try{
                    obj.iFIS();
                    obj.iBIS();
                    obj.iFOS("Hello World");
                    obj.iBOS("This is me");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        ```       
3. OOP Concepts
    * Metropolis in Java
        ```java
        public class Metropolis{
            private int MCode;
            private String MName;
            private long MPop;
            private float Area;
            private float PopDens;
            public void callDen(){
                PopDens = MPop / Area; 
            }
            public void enter(){
                try(Scanner s = new Scanner(System.in)){
                    System.out.println("Enter value for MCode, MName, MPop and Area");
                    MCode = s.nextInt();
                    s.nextLine();
                    MName = s.nextLine();
                    MPop = s.nextLong();
                    Area = s.nextFloat();
                }
            }
            public void viewAll(){
                callDen();
                StringBuilder s = new StringBuilder();
                s.append("Metropolis Statistic\n");
                s.append("MCode: ").append(MCode).append("\n");
                s.append("MName: ").append(MName).append("\n");
                s.append("Area: ").append(Area).append(" with the population of ").append(MPop).append("\n");
                if(Float.compare(PopDens, 1200f) > 0)
                    s.append("High Populated Area with the Density of ").append(PopDens);
                else s.append("Low Populated Area with the Density of ").append(PopDens);
                System.out.println(s.toString());
            }
            public static void main(String args[]){
                Metropolis m = new Metropolis();
                m.enter();
                m.viewAll();
            }
        }
        ```            
    * OOP Concepts
        * Class
            * Class is a blueprint from which an individual object is created.
            * Class is a user-defined datatype.
            * A class is collection of data and function
        * Object
            * An object is an instance of a class.
            * An object stores its state in the fields and exposes its behaviour via the methods.
        * Inheritance
            * Inheritance is deriving the behaviours and the properties of a superclass into a subclass.
            A class is designed to have only one direct superclass but has the potentiality of having endless number of subclasses.
            * A superclass is a class which is derived by another class. A subclass is a class that derives from a superclass.
            * A subclass inherits all the members of a superclass excepts the constructor.
        * Encapsulation
            * Encapsulation is the methodology of hiding certain elements
             of the implementation of a class but providing a public interfaces to a client software.
            * Encapsulation is implemented using private and protected access specifier. 
        * Abstraction
            * Abstraction is the force of hiding private implementation details behind public interfaces.
            * Abstract class is a class declared with abstract keyword that has either or both of
            concrete and abstract functions.
            * Abstract function is the function that has only its prototype.
            * Abstract class provide the blueprint for a concrete class
            * Abstract class cannot be instantiated but it can be subclassed.
        * Polymorphism
            * Polymorphism is the ability of an object to take more than one form based on the situation.
            * Function Overloading is creating multiple functions with the same name but with different
            set of arguments.
            * Type of Polymorphism
                * Static Binding/Static Polymorphism/Compiletime Polymorphism: the form of an actions taken by the object is determined
                during the compile time.
                * Dynamic Binding/Dynamic Polymorphism/Runtime Polymorphism: the form of an action taken by the object is differed to the runtime.
        * Interface
            * Interface is reference type similar to a class that can only contains constants and abstract methods.
            In Java8, an interface can also have static and default methods.
            * By default:
                * All fields are public static final (constant) and it has to be initialized
                * No access specifier, the access specifier is public
                * Static method has to be declared with static keyword and its body; it cannot be overridden
                * Default method has to be declared with default keyword and its body; it can be overridden
                * No static block is allowed
            * An Interface is a contract between the class and the outside which is enforced during build time by the compiler. 
            * Interface cannot be instantiated; it can only be implemented by classes or extended by the other interfaces.
4. Collections-List and MultiThreading
    1. Performance of List (ArrayList and LinkedList)
        * Both of them implements list interface and maintains insertion order; they are non-synchronized classes.
        * ArrayList :
            * internally uses dynamic array
            * manipulation is slow 'cause if any element is removed, all the bits are shifted in the memory
            * only act as list
            * better for sorting and accessing data
        * LinkedList
            * internally uses doubly linked list
            * manipulation is faster - no bit shifting
            * can act a list and queue
            * better for manipulation
        * Measurements
            ```java
            public class DemoC4A1 {
                public static void main(String args[]){
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    long startA, endA, startB, endB;
            
                    startA = System.nanoTime();
                    for(int i = 0; i < 1000; i++)
                        arrayList.add(i);
                    for(int i = 0; i < 100; i++)
                        arrayList.remove(i+ new Random().nextInt(50));
                    endA = System.nanoTime();
                    System.out.println("To manipulate item for ArrayList " + (endA-startA));
            
                    startB = System.nanoTime();
                    for(int i = 0; i < 1000; i++)
                        linkedList.add(i);
                    for(int i = 0; i < 100; i++)
                        arrayList.remove(i+ new Random().nextInt(50));
                    endB = System.nanoTime();
                    System.out.println("To manipulate item for LinkedList " + (endB-startB));
                }
            }
            ```
    2. hashCode and equals
    * Four things to be remembered for user-defined datatype
        * implements Comparable interface and compareTo() for natural ordering 
        or implements Comparator interface and compare() for user-defined ordering
        * toString()
        * hashCode() and equals()
        * constructor
    * hashCode : 
        * If two objects are equal according to equals(Object), 
        hashCode on each of the two objects must return the same integer value
        * It's not required that if two objects are unequal according to equals(Object),
        hashCode on each of the tow objects must return a distinct integer value
        * For practical reason, the hashCode does(should) return distinct integers for distinct objects
        which may improve the performance of hash tables
    * equals :
        * implements the most discriminating possible equivalence relation on objects
        * i.e. for any non-null reference values x and y, equals() returns true
        if x and y refer to the same object and (x == y) has the value true.
    * Program
        ```java
        public class Students implements Comparable<Students>{
            Integer id;
            String name;
            @Override
            public int compareTo(Student obj){
                // tell the Collection.sort() to sort based on id
                return id-obj.id;
            }
            public Students(int id, String name){
                this.id = id;
                this.name = name;
            }
            @Override
            public String toString(){
                return id + ": " + name;
            }
            @Override
            public int hashCode(){
                final int prime = 31;
                int result = 1;
                result = prime * result + ((id == null)?0:id.hashCode());
                result = prime * result + ((name == null)?0:name.hashCode());
                return result;
            }
            @Override
            public boolean equals(Object obj){
                if(this == obj) return true;
                if(obj == null) return false;
                if(getClass() != obj.getClass()) return false;
                
                Students other = (Students) obj;
                
                if(id == null){
                    if(other.id != null)
                        return false;
                }else if(!id.equals(other.id)) return false;
                
                if(name == null){
                    if(other.name != null)
                        return false;
                }else if(!name.equals(other.name)) return false;
                return true;
            }
            
        }
        ```    
    3. Synchronized and Volatile
        * synchronized is used to avoid thread interference and memory consistency
         error by using locking.
        * volatile is used to achieved atomic access (read and write).
        volatile keyword will make all threads refer to the volatile variable all the time.
        * Program
        ```java
        public class VolatileSynchronization implements Runnable{
            @Override
            public void run(){
                for(int i = 0; i < 100; i++)
                    increase();
            }
            private volatile static int data = 0;
            private synchronized void increase(){
                    data++;
            }
            public static void main(String args[]){
                Thread t1 = new Thread(new VolatileSynchronization());
                Thread t2 = new Thread(new VolatileSynchronization());
                t1.start();
                t2.start();
                try{
                    t1.join();
                    t2.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Consistent Value of the data " + data);
            }
        }
        ```
    4. join(), sleep(), wait(), notify(), notifyAll()
        ```java
        public class VisitingMalaysia{
            private int distance = 100525;
            private synchronized void startGoing(){
                System.out.println("Leaving home for the airport");
                System.out.println("Reach the airport...Flying now");
                try{
                     wait();
                }catch (Exception e){e.printStackTrace();}
                System.out.println("Reached Malaysia");
            }
            private synchronized void welcomeToMalaysia(){
                try{
                    wait();
                }catch (Exception e){e.printStackTrace();}
                System.out.println("Welcome to Malaysia");
            }
            private synchronized void startJourney(){
                int i = 0;
                try{
                    Thread.sleep(100);
                }catch (Exception e) {e.printStackTrace();}
                do{
                    i++;
                }while(i != distance);
                notifyAll();
            }
            public static void main(String[] args){
              VisitingMalaysia obj = new VisitingMalaysia();
              Thread chhatra = new Thread(new Runnable() {
                  @Override
                  public void run(){obj.startGoing();}
              });
              Thread local= new Thread(new Runnable() {
                  @Override
                  public void run(){obj.welcomeToMalaysia();}
              });
              Thread flying = new Thread(new Runnable() {
                  @Override
                  public void run(){obj.startJourney();}
              });
              chhatra.start();
              local.start();
              flying.start();
              try{
                  chhatra.join();
                  local.join();
                  flying.join();
              }catch (Exception e){
                  e.printStackTrace();
              }
              System.out.println("Arrived Safe and Sound");
            }
        }
        ```       