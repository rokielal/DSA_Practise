package Arrays;

import java.util.*;

public class FindSuffixSumOfArray {

    public static int[] suffixSum(int[] arr){


        for(int i=arr.length-2; i>=0; i--){
            arr[i] = arr[i] + arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter Elements in array");
        int[] arr = new int[n];

//
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(suffixSum(arr)));
    }
}
