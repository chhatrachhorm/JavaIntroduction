package signleton;

public class KIT {
    private Integer currentStudent;
    // make default static instance of the class
    private static KIT kit = new KIT(100);
    // make constructor private
    private KIT(Integer currentStudent){
        this.currentStudent = currentStudent;
    }
    public static void printKITStudent(){
        System.out.printf("The Total Students in KIT is " + kit.currentStudent);
    }
}
