package Arrays;

import java.util.*;

// Given an integer array "a", return the prefix sum/running sum in the same array without creating a new array
public class PrefixSumInTheSameArray {

    public static int[] makePrefixSumWithNewArray(int[] arr, int n){

//        This we are creating a new array to store the prefix sum
        int[] pref = new int[n];

        pref[0] = arr[0];

        for(int i=1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    public static int[] makePrefixSumWithoutCreatingNewArray(int[] arr, int n){

        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
            int[] arr = {2,1,3,4,5};
            int n = arr.length;

        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        System.out.println("Prefix sum with creating new Array");
        System.out.println(Arrays.toString(makePrefixSumWithNewArray(arr,n)));

        System.out.println("Prefix sum without creating new Array");
        System.out.println(Arrays.toString(makePrefixSumWithoutCreatingNewArray(arr,n)));
    }
}
