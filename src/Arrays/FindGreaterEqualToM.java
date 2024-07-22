package Arrays;
import java.util.*;
//Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//integer)
//Input:
//5
//10
//1 2 1 4 5 2 1 1 2 2
//Expected Output:
//false
public class FindGreaterEqualToM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n]; //store the n integers in an array
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] >= m) count++;
        }

        if(count > 5) System.out.println("True");
        else System.out.println("False");
    }
}
