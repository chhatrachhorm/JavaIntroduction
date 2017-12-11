package Analysis;

import Utility.PrintArray;

public class InsertionSort {
    /*
    * https://www.youtube.com/watch?v=c4BRHC7kTaQ
    * */
    public static int[] intInsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{23, 12, 2, 45, 1, 87, 24};
        int b[] = intInsertionSort(arr);
        PrintArray.printArray("Result: ", b);
    }
}
