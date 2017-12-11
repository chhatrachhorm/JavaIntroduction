package Analysis;

import Utility.PrintArray;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{15, 12, 26, 236, 985, 654, 12, 32};
        selectionSort(a);
        PrintArray.printArray("Result", a);
    }
}
