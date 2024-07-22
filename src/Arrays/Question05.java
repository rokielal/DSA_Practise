package Arrays;

import java.util.Arrays;

public class Question05 {
    //   2: Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
//all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies
//the condition.
//Input :
//[1,2,3,4,5]
//Output :
//[4,2,3,1,5]

    public static void moveEvenAtFirst(int[] arr){

        int i = 0;
        int j = arr.length -1;

        while(i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i] %2 ==0) i++;
            if(arr[j] %2 !=0) j--;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8,4};
        moveEvenAtFirst(arr);

    }
}
//Take two pointers one from start and another from end, and if the starting pointer’s element has
//odd value and ending pointer’s value is even, then we need to swap them as we want to sort the array. Check
//this at every iteration and change values if it satisfies the condition else if it is fine then just increment the
//starting pointer and decrement the ending pointer as shown.

