package Arrays;
import java.util.*;
//- Write a Java program to test the equality of two arrays. Both arrays are of equal size n and m
public class CheckEqualArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        boolean flag = true;
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();

            if(arr2[i] != arr1[i]){
                flag = false;
                break;
            }
        }
        if(!flag) System.out.println("Arrays are not equal");
        else System.out.println("Arrays are equal");
    }
}
