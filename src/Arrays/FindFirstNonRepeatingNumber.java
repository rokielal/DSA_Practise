package Arrays;
import java.util.*;

//Given an array of integers of size N, the task is to find the first non-repeating element in this array.
public class FindFirstNonRepeatingNumber {

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 0};

        HashMap<Integer, Integer> mp = new HashMap<>();

//        for(int el : arr){
//            if(!mp.containsKey(el)){
//                mp.put(el,1);
//            }
//            else{
//                mp.put(el, mp.get(el)+1);
//            }
//        }
//        System.out.println(mp);

//        Shortcut way to put key,values in HashMap using getOrDefault()
        for(int el : arr){
            mp.put(el , mp.getOrDefault(el,0)+1);
        }

//        System.out.println(mp); // {-1=2, 0=1, 2=1, 3=1}  here 0 is 1 times 2 is 1 times and 3 also 1 times but
//        as per question, I have to print first non-repeating number

//       As in HashMap elements are not arranged in order so if we iterate over map and get the key value of first
//        non-repeating than ans may be wrong. To solve this we can traverse through original array and compare
//        the value of each element using get() and print the first element.

//        for(var el : mp.entrySet()){
//
//            if(el.getValue() == 1){
//                int ans = el.getKey();
//                System.out.println(ans);
//                return;
//            }
//
//        }

//        If we add the return keyword than only first non-repeating element will be printed
        System.out.println("Printing all non-repeating elements ");
        for(int el : arr){
            if(mp.get(el) == 1){
                System.out.println(el);

            }
        }

        System.out.println("Printing first non repeating element ");
        for(int el : arr){
            if(mp.get(el) == 1){
                System.out.println(el);
                return;
            }
        }

    }
}
