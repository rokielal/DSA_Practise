package Arrays;

import java.util.Scanner;
import java.util.Arrays;

//    - Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//find the Kth smallest element in the given array. It is given that all array elements are
//distinct.
//
//(Easy)
//
//Assignment Solutions
//
//Input:
//N = 6
//arr[] = 7 10 4 3 20 15
//K = 3
//Output:7
public class Question02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();

//        Method 1: First sort the array then the element present in k-1 index will the kth shortest element

        Arrays.sort(arr);
        int ans = arr[k-1];
        System.out.println(ans);

//        Method 2: First sort the array, then traverse the array and store the element in the k-1 element to
//        a variable and print the variable

        Arrays.sort(arr);
        int ans1 = -1;
        for(int i=0; i<n; i++){
            if(i == k-1){
                ans1 = arr[i];

            }
        }
        System.out.println(ans1);
    }
}
