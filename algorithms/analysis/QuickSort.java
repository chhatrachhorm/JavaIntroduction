package analysis;

import utility.PrintArray;

public class QuickSort {

    private int[] numbers;
    public void sort(int[] values){
        if(values == null || values.length == 0)
            return;
        numbers = values;
        quickSort(0, values.length - 1);
    }
    private void quickSort(int low, int high){
        int l = low, r = high;
        int key = low + (high-low)/2;
        while (l < r){
            while (numbers[l] < numbers[key]){
                l++;
            }
            while (numbers[r]>numbers[key]){
                r--;
            }
            if(l <= r){
                int temp = numbers[l];
                numbers[l] = numbers[r];
                numbers[r] = temp;
                r--;
                l++;
            }
        }
        if(low < r)
            quickSort(low, r);
        if(l < high)
            quickSort(l, high);

    }


    public static void main(String[] args) {
        int[] a = new int[]{15, 13, 32, 26, 48, 21, 98, 92, 28, 52};
        new QuickSort().sort(a);
        PrintArray.printArray("Result: ", a);
    }

}
