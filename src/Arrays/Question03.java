package Arrays;
import java.util.Arrays;

//    Reverse the array
public class Question03 {

    public static void reverse(int[] arr){

//        Create a new ans array to store the value of array
        int[] ans = new int[arr.length];
        int idex = 0;

        for(int i=arr.length-1; i>=0; i--){

            ans[idex++] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }

    public static int[] reverseUsingInt(int[] arr){

        int[] result = new int[arr.length];
        int idx = 0;

        for(int i= arr.length-1; i>=0; i--){
            result[idx++] = arr[i];

        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {1,23,5,6,2,3,9};
        reverse(arr);

        int[] ans = reverseUsingInt(arr);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
