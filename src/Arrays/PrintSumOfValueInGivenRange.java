package Arrays;
import java.util.*;
public class PrintSumOfValueInGivenRange {
// Brute Force Approach
    public static int findSumInRange(int[] arr, int l, int r){

        int sum = 0;
        for(int i=l; i<=r; i++){
            sum += arr[i];
        }
        return sum;
    }
//    Optimized Approach
    public static int[] findSumInRangeUsingPrefix(int[] arr){


        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter Elements in array");
        int[] arr = new int[n+1];

//        Taking input in 1-based indexing
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

//        int[] pref = findSumInRangeUsingPrefix(arr);
        findSumInRangeUsingPrefix(arr);

        System.out.println("Enter queries");
        int q = sc.nextInt();
        while (q-- >0){
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();

//            int sum = pref[r] - pref[l-1];
            int sum = arr[r] - arr[l-1];
            System.out.println(sum);
        }

    }
}
