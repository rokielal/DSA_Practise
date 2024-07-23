package Arrays;

import java.util.Arrays;

public class RotateArrayRightByOne {

    public static void rotateRight(int[] arr, int n){

        int temp = arr[n-1];

        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println("Rotated Using Optimized Solution: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int temp = arr[n-1];

        int[] newArr = new int[n];

        newArr[0] = temp;
        for(int i=0; i<n-1; i++){
            newArr[i+1] = arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Rotated array by one to it's Right: " +Arrays.toString(newArr));
        rotateRight(arr, n);
    }
}
