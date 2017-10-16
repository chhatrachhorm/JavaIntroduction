package ModelExamination.basics;

public class DerivedClass extends BasicsReview {
    // constructor the super class
    public DerivedClass(int score, float average) {
        super(score, average);
    }

    public static void main(String[] args) {
        DerivedClass d = new DerivedClass(1205, 125f);
        d.printMyInfo();

        // accessing static fields from either the subclass or the super class
        System.out.println("Accessing Static : " + BasicsReview.SCHOOL_ID + " and " + DerivedClass.SCHOOL_NAME);
    }

}
