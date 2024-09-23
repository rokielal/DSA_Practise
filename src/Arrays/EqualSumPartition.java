package Arrays;

import java.util.*;

public class EqualSumPartition {

    public static int totalSum(int[] arr){
        int totalSum = 0;

        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    public static boolean checkSumPartition(int[] arr){
        int totalSum = totalSum(arr);

        int prefixSum = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if(prefixSum == suffixSum) return true;
        }

        return false;
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

        boolean ans = checkSumPartition(arr);

        System.out.println(ans);
    }
}
