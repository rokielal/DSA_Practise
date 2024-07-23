package Sortings;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {8,3,6,5,0,4,2,1,7};

        System.out.println("Original Array is: " + Arrays.toString(arr));
        int n = arr.length;

        for(int i=1; i<n; i++){

            int j = i;

            while(j>0 && arr[j] < arr[j-1]){

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        System.out.println("Shorted Array is: " + Arrays.toString(arr));
    }
}
