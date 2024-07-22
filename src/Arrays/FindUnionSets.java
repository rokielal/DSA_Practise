package Arrays;
import java.util.*;
//Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
//union between these two arrays and print the number of elements of the union set.
//Union of the two arrays can be defined as the set containing distinct elements from both
//the arrays. If there are repetitions, then only one occurrence of element should be printed
//in the union.
//
//(Medium)
//
//Assignment Solutions
//
//Input:
//5 3
//1 2 3
//1 2 3 4 5
//Output:
//5
public class FindUnionSets {

//    using Hashset
    public static int findUnion(int[] a, int[] b){
//        We know that as per question size of array b is >= size of array a, so first I will add all the element of
//        array b in a set and than element of array a, if any duplicate element is found set will not allow that
//        element in the set and all elements will be distinct.

        HashSet<Integer> set = new HashSet<>();

        for(int el : b) set.add(el);
        for(int el : a) set.add(el);

        System.out.println(set);

        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1");
        int n = sc.nextInt(); // size of array arr1
        System.out.println("Enter array1 element");
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of array 2");
        int m = sc.nextInt(); // size of array arr1
        System.out.println("Enter array2 element");
        int[] arr2 = new int[m];

        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        int ans = findUnion(arr1,arr2);
        System.out.println(ans);

    }
}
