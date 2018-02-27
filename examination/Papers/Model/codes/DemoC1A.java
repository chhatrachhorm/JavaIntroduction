package Papers.Model.codes;

import java.util.Scanner;

public class DemoC1A {
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
