package utility;

public class MaxMin {
    public static int getMax(int[] arr){
        int max = 0;
        for(int i: arr){
            if(max < i)
                max = i;
        }
        return max;
    }
    public static int getMax(Integer[] arr){
        int max = 0;
        for(int m: arr){
            if(max<m)
                max = m;
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = 0;
        for(int i: arr){
            if(min>i)
                min = i;
        }
        return min;
    }
}
