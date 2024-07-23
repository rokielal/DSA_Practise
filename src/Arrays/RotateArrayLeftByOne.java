package Arrays;

import java.util.Arrays;

public class RotateArrayLeftByOne {

    public static void rotateLeft(int[] arr){

        int n = arr.length;
        int temp = arr[0];

        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};

//        Store the first element in temp
        int temp = arr[0];

//        Create another array of same size and store the value from original array from index 1 to n-1, as in last
//        index of newArray we have to manually put the element stored in temp varaible

        int[] newArr = new int[arr.length];

        for(int i=0; i<arr.length-1; i++){

            newArr[i] = arr[i+1];
        }
        newArr[arr.length - 1] = temp;

        //        In this approach TC= o(n2) and SC = O(n) as we are creating new array

        System.out.println(Arrays.toString(newArr));

        rotateLeft(arr);
    }
}
