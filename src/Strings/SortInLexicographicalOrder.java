package Strings;
import java.util.*;

//
public class SortInLexicographicalOrder {
    public static void main(String[] args) {

//        String[] fruits = {"mango", "papaya","apple", "orange","banana","kiwi"};
        String[] fruits = {"coding", "is","fun"};
        int n = fruits.length;

        System.out.println("Original Array: " + Arrays.toString(fruits));
//        Selection Sort

        for(int i=0; i<n-1; i++){

            int min_index = i;
//            String minStr = fruits[i];

            for(int j=i+1; j<n; j++){

                if(fruits[j].compareTo(fruits[min_index]) < 0)  // ascending order
//                    if(fruits[j].compareTo(fruits[min_index]) > 0)  // descending order
                {
                    min_index = j;
                }
            }

            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;

        }

        System.out.println(Arrays.toString(fruits));
    }
}
