package Arrays;

import java.util.*;

//Count the number of occurrences of a particular element x.
//Input a[] = {1 , 4, 7 , 9 , 1}
//x = 1
//Output 2
public class CountOccurance {
    public static void count(int[] arr, int x){

        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int e : arr){
            if(!mp.containsKey(e)){
                mp.put(e,1);
            }
            else{
                mp.put(e,mp.get(e)+1);
            }
        }

//        This is how we can get values from map
//        System.out.println("Values are");
//        for(var el : mp.entrySet()){
//            System.out.println(el.getValue());
//
//        }
//
//        This is how we can get key from map
//        System.out.println("Keys are");
//        for(var el : mp.entrySet()){
//            System.out.println(el.getKey());
//        }


        for(var el : mp.entrySet()){
            if(el.getKey() == x)
            System.out.println("Occurence found using map: " + el.getValue());
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,4,7,9,1,1,1};
        int x =1;

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) count++;
        }
        System.out.println("Occurance found using loop: " + count);

        count(arr, x); // calling count function
    }

}
