package Arrays;

import java.util.Scanner;

public class ArraysCommonExample {
    //Find the last occurrence of an element x in a given array.
    /*
        Input a[] = {1 , 4, 7 , 9 , 1}
        x = 1
        Output 4
     */

    public static int lastOccurance(int[] arr, int x, int n){

        int index = -1;

        for(int i=0; i<n; i++){

            if(arr[i] == x){
                index = i;
            }
        }
        return index;
    }

    /*Count the number of occurrences of a particular element x.
    Input a[] = {1 , 4, 7 , 9 , 1}
    x = 1
    Output 2*/

    public static int countOccurrence(int[] arr, int x, int n){
        int count=0;
        for(int i=0; i<n; i++){

            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    /*Check if the given array is sorted or not.
        Input a[] = {1 , 2, 3 , 4 , 5}
        Output True*/

    public static boolean checkSorted(int[] arr, int n){

        boolean flag = false;
        for(int i=0; i<n-1; i++){
            if(arr[i] <= arr[i+1]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean check(int[] arr, int n) {
        boolean ans = true;
        for(int i = 1; i < n; i++) {
            if(arr[i] <= arr[i-1])
                ans = false;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int x = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.print(lastOccurance(arr,x,n));
//        System.out.print(countOccurrence(arr,x,n));
//        System.out.println(checkSorted(arr,n));
        System.out.println(check(arr,n));
    }
}
