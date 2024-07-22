package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//    Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
//all negative elements at the end of array without changing the order of positive elements
//and negative elements
//
//(Medium)
//
//Assignment Solutions
//
//Input :
//N = 8
//arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//Output :
//1 3 2 11 6 -1 -7 -5
public class Question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        Creating new Array of size n
        int[] ans = new int[n];
        int idx = 0;

        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                ans[idx++] = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] < 0) {
                ans[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
// To solve this we have to create a new Array of same size n
// then first for loop is used to check if number is greater than zero than insert all element to result array
// then another for is used to check if number is less than zero than insert all element to result array
// Finally print the result array
