package Arrays;
import java.util.*;
//3: Count the number of elements strictly greater than value x.
//Input a[] = {1 , 4, 7 , 9 , 1}
//x = 1
//Output 3
public class CountOccurenceGreaterThanX {
//    public static int countGreater(int[] arr, int x){
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int el: arr){
//            if(el > x) set.add(el);
//        }
//        return set.size();
//    }
    public static void main(String[] args) {
        int[] arr = {1 , 4, 7 , 9 , 1,4,2,6,7};
        int x = 1;

        int cnt = 0;
        for(int i : arr){
            if(i > x) cnt++;
        }
        System.out.println("Using simple loop: " + cnt);

//        This question cannot be done using hashset as hashset cannot contain duplicate value, but if in question
//        it is mentioned that all elements are distinct than we can use HashSet
//        int ans = countGreater(arr, x);
//        System.out.println("Using Hashset: " + ans);
    }
}
