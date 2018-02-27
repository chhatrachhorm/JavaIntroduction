package internalExamination.throwableClass.runtimeExceptionDemo;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String args[]){
        int num1, num2, ans;
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter num1 and num2: ");
            num1 = s.nextInt();
            num2 = s.nextInt();
        }
        try{
            ans = num1 / num2;
            System.out.println(num1 + "/"+num2+" = "+ans);
        }catch (ArithmeticException e){
            System.out.println("You have enter second number = " + num2 + " improperly which cause "+e.getMessage() + " "+e.getClass());
        }
    }
}
