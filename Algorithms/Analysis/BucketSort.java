package Analysis;

import Utility.MaxMin;
import Utility.PrintArray;

import java.util.*;
import java.util.Map;

public class BucketSort {
    public static void bucketSort(Integer[] array){
        int n = array.length;
        int max = MaxMin.getMax(array);
        System.out.println(max);
        Map<Integer, List<Integer>> buckets = new TreeMap<>();
        for(int a: array){
            int index = (a*n)/(max + 1);
            System.out.println("Index: " + index);
            buckets.computeIfAbsent(index, k -> new ArrayList<>());
            buckets.get(index).add(a);
        }
        System.out.println(buckets);
        Set<Integer> bucketSet = buckets.keySet();
        int index = 0;
        for(Integer i: bucketSet){
            Integer[] bucketArray = new Integer[buckets.get(i).size()];
            bucketArray = buckets.get(i).toArray(bucketArray);
            InsertionSort.insertionSort(bucketArray);
            for(Integer e: bucketArray){
                array[index++] = e;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{23, 12, 2, 45, 1, 87, 24, 36, 72, 95, 12, 125, 152, 102, 156, 126 };
        bucketSort(arr);
        PrintArray.printArray("BucketSort", arr);
    }
}