package Sortings;

import java.util.Arrays;

public class MergeSort {

    public static void display(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
    }
    public static void merge(int[] arr, int l, int mid, int r){

        int n1 = mid-l+1;  // size of left array
        int n2 = r - mid;  // size of right array

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(int j=0; j<n2; j++){
            right[j] = arr[mid+1+j];
        }

//
        int i = 0;
        int j = 0;
        int k = l; // k will be equal to l bcz it is not necessary that when we get the array k=0 always.

        while(i < n1 && j < n2){

            if(left[i] < right[j]){
                arr[k++] = left[i++];
//                i++;
//                k++;
            }else{
                arr[k++] = right[j++];
//                j++;
//                k++;
            }
        }

        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];


    }
    public static void mergeSort(int[] arr, int l, int r){

        if(l >= r) return;
        int mid = (l+r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);

    }
    public static void main(String[] args) {

        int[] arr = {7,20,4,11,8,2};
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

       mergeSort(arr, 0 ,n-1);

        display(arr);

    }
}
