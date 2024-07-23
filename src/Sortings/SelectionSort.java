package Sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,4,1,2,100,90};

        System.out.println("Original Array is: " + Arrays.toString(arr));
        int n = arr.length;

        for(int i=0; i<n-1; i++){

            int minIndex = i;

            for(int j=i+1; j<n; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
//            Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }


        System.out.println("Shorted Array is: " + Arrays.toString(arr));
    }
}
