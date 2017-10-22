package ModelExamination;

public class BasicsReview {
    // const and static fields
    private static final int MY_AGE = 20;
    protected static final String SCHOOL_NAME;
    protected static final String SCHOOL_ID;
    static{
        SCHOOL_NAME = "KIT";
        SCHOOL_ID = "KIT1001";
    }
    // instance fields
    private int score;
    private float average;

    // constructor
    public BasicsReview(int score, float average){
        this.score = score;
        this.average = average;
    }
    protected void printMyInfo(){
        System.out.println("My information : " + score + " and average : " + average);
    }
    public static void main(String args[]){
        System.out.println("My age is " + MY_AGE);

        // Instantiating the obj
        BasicsReview b = new BasicsReview(102, 126.3f);
        b.printMyInfo();

    }
}
