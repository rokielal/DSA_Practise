package Arrays;
import java.util.*;
// Rotate the array arr by k steps, where k is non-negative.
// Note: k can be greater than n as well
public class RotateArrayByKSteps {

    public static void rotate(int[] arr, int n, int k){
//      Approach 1:-This approach will take extra space as we are creating a new array ans[] to store the value

        k = k % n;

        int[] ans = new int[n];
        int idx = 0;

        for(int i =n-k; i<n; i++){
            ans[idx++] = arr[i];
        }

        for(int i = 0; i<=n-k-1; i++){
            ans[idx++] = arr[i];
        }
        System.out.println("Rotated array by Approach 1: ");
        System.out.println(Arrays.toString(ans));
    }

    public static void rotateInPlace(int[] arr, int n, int k){
//  Approach 2:-This approach will not take extra space as we are doing in-place rotation

        k = k %n;
//        reverse(arr,0,n-k-1);
//        reverse(arr,n-k, n-1);
//        reverse(arr, 0, n-1);

//        Another better approach
        reverse(arr,0,n-1);
        reverse(arr,0, k-1);
        reverse(arr,k, n-1);

        System.out.println("Rotated array by Approach 2: ");
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr, int i, int j){

        while (i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));

        rotate(arr,n,k);
        rotateInPlace(arr,n,k);


    }
}
