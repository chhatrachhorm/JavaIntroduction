package InternalExamination.ThrowableClass.RuntimeExceptionDemo;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String args[]){
        int[] arr = new int[5];
        try(Scanner s = new Scanner(System.in)){
            for(int i = 0; i<arr.length; i++)
                arr[i] = s.nextInt();
        }
        try{
            int ans = arr[1]/arr[3];
            int a = arr[arr[4]];
            System.out.println("Yeah, You see me!");
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
//        try{
//            int ans = arr[1]/arr[3];
//            int a = arr[arr[4]];
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
    }
}
