package Arrays;
import java.util.*;
//- Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//missing number from the first N integers. There are no duplicates in the list.
public class FindMissingNumber {
    public static int findMissingNumber(int[] arr, int N){

        // Formula to calculate sum of the first N natural numbers
        int totalSum = N * (N+1)/2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for(int i=0; i<arr.length; i++){
            arraySum += arr[i];
        }

        // The missing number is the difference between the expected sum and the actual sum
        return totalSum - arraySum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6,3,8}; // array size is 7 so N is 8
        int N = 8; // N will be always greater than given array size by 1

        // Find and print the missing number
        int missingNumber = findMissingNumber(arr, N);
        System.out.println("The missing number is: " + missingNumber);
    }
}
