package analysis;

import utility.PrintArray;

import java.util.stream.IntStream;

public class BubleSort {
    public static void intSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    /*
    * 1) Stream
    * 2) flatMap
    *    How it works:
    *       Stream<String[]>        -> flatMap ->   Stream<String>
    *       Stream<Set<String>>	    -> flatMap ->	Stream<String>
    *       Stream<List<String>>    -> flatMap ->	Stream<String>
    *       Stream<List<Object>>	-> flatMap ->	Stream<Object>
    *       e.g. { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
    * */
    public static int[] intSortJava8(int[] arr){
        IntStream.range(0, arr.length-1)
                .flatMap(i -> IntStream.range(i+1, arr.length-1))
                .forEach(j ->{
                    if(arr[j-1] > arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                });
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{5, 8 , 62 , 22, 963, 1, 156};
        intSort(arr);
        int b[] = intSortJava8(arr);
        PrintArray.printArray("Array A: ", arr);
        PrintArray.printArray("Array B: ", b);
    }
}
