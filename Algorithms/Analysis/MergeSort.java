package Analysis;

import Utility.PrintArray;

public class MergeSort {
    /*
    * Using Recursive and Array Address not Array VALUE
    * */
    public static int[] divideAndConquer(int[] arr){
        int n = arr.length;
        if(n == 1)
            return arr;
        int mid = n/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];
        System.arraycopy(arr, 0, leftArr, 0, leftArr.length);
        System.arraycopy(arr, leftArr.length, rightArr, 0, rightArr.length);
        PrintArray.printArray("Left Array", leftArr);
        PrintArray.printArray("Right Array", rightArr);
        divideAndConquer(leftArr);
        divideAndConquer(rightArr);
        PrintArray.printArray("Before Calling Merge", arr);
        merge(leftArr, rightArr, arr);
        PrintArray.printArray("Before Return Array", arr);
        return arr;
    }
    public static void merge(int[] leftArr, int[] rightArr, int[] sortedArr){
        PrintArray.printArray("What Got in Merge: ", sortedArr);
        int lLength = leftArr.length;
        int rLength = rightArr.length;
        int i = 0, j = 0, k = 0;
        while(i < lLength && j < rLength){
            if(leftArr[i] < rightArr[j]){
                sortedArr[k] = leftArr[i];
                i++;
            }else{
                sortedArr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < lLength){
            sortedArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rLength){
            sortedArr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int a[] = divideAndConquer(new int[]{15, 562, 125, 23, 12, 2, 45, 1, 87, 24});
        PrintArray.printArray("", a);
    }
}
