package internalExamination.throwableClass.userDefinedException;

import java.util.Scanner;

public class Election {
    private static boolean testAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Less than 18");
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int age;
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter your age: ");
            age = s.nextInt();
        }
        try {
            if(testAge(age)){
                System.out.println("you can vote now");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Ooops! You are still young! ");
            e.printStackTrace();
        }
    }
}
