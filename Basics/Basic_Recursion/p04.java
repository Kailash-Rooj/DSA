// Reverse a given Array
import java.util.*;

public class p04 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        fn(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void fn(int[] arr , int st , int end){
        if(st >= end)return;
        // swap
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        fn(arr, st + 1 , end - 1);
    }
}