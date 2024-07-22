package Arrays;

import java.util.Arrays;

public class Question04 {
    //    1: Sort an Array consisting of only 0s and 1s.
//Input
//[ 0,1,1,0,1,1,0]
//Output
//[0,0,0,1,1,1,1]

    public static void zeroesSort(int[] arr){
        int n = arr.length;
        int count = 0;
//        Count number of zeroes
        for(int i=0; i<n; i++){
            if (arr[i] ==0){
                count++;
            }
        }

//        0 to count-1 : 0 and count to n-1 : 1
//        for(int i=0; i<count-1; i++){
//            arr[i] = 0;
//        }
//        for(int i=count; i<n; i++){
//            arr[i] = 1;
//        }

//        Sortcut
        for(int i=0; i<n;i++){
            if(i < count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

//    Optimized Approach using two pointer
//    Explanation: Take two pointers one from start and another from end, and if the starting pointer’s element has
//value 1 and ending pointer’s value is 0, then we need to swap them as we want to sort the array. Check this at
//every iteration and change values if it satisfies the condition else if it is fine then just increment the starting
//pointer and decrement the ending pointer as shown.

    public static void sortZeores(int[]arr){

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            if(arr[start] == 1 && arr[end] == 0){
                arr[start] = 0;
                arr[end] = 1;
                start++;
                end--;
            }
            if(arr[start] == 0) start++;
            if(arr[end] == 1) end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1,0,0,1,1,0,1,0,0,0,0};
        zeroesSort(arr);

        sortZeores(arr);

    }
}
