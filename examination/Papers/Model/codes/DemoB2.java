package Papers.Model.codes;

import java.util.Scanner;

public class DemoB2 {
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
