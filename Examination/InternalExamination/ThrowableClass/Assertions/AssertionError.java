package InternalExamination.ThrowableClass.Assertions;

import java.util.Scanner;

public class AssertionError {
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        assert a>100:"It has to be greater than 100";
        System.out.println("Welcome to hundred world!");
    }
    // go to Run -> Edit Configuration -> Configuration -> Virtual Machine Option => add : -ea
}
