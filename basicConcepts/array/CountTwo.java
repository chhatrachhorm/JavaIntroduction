package array;

import java.util.Scanner;

/**
 * Created by chhormchhatra on 7/21/17.
 */
public class CountTwo {
    public static void main(String args[]){
        int a[] = new int[10];
        try(Scanner s = new Scanner(System.in)){
            for(int i =0 ; i<10; i++) {
                a[i] = s.nextInt();
            }
        }
        int count = 0;
        for(int i =0; i<10; i++)
            if(Integer.toString(a[i]).charAt(0)=='2') count++;
        /*
        * I wrote
        *  if(a[i].toString().charAt(0).equals("2")) count++;
        * */
        System.out.println(count);

    }
}
