package Arrays;
import java.util.*;
//Given an array sorted in increasing order of size n and an integer x, find if there exists a
//pair in the array whose absolute difference is exactly x
public class FindAbsoluteDifferenceEqualToX {

    public static void findAbsDiff(int[] arr, int x){

        int start = 0;
        int end = 1;
        while (start < arr.length){

            if(arr[end] - arr[start] == x){
                System.out.println("Pair Found: " + arr[start] +", "+ arr[end]);
                return;
            } else if (arr[end] - arr[start] < x) {
                end++;

            }else {
                start++;
            }
//            if (start == end) {
//                end++;
//            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

//        Brute force Approach

//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//
//                if(arr[j] - arr[i] == x){
//                    System.out.print("Pair found: " + arr[i] +", "+ arr[j]);
//                    return;
//                }
//            }
//        }
//        System.out.println("Pair Not found");
        System.out.println("Optimize approach");
        findAbsDiff(arr,x);
    }
}
