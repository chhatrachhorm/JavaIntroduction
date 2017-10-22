package Papers.Model.Codes;

import java.util.ArrayList;
import java.util.Scanner;

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
