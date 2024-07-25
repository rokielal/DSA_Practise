package Arrays;
import java.util.*;
public class MoveZeroToLast {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,3,12};
        int[] arr = {6,0,1,0,3,12};
        int i= 0;
        int j = 1;

        while (j < arr.length){

//            Edge case
            if(arr.length == 1){
                return;
            }
            else if(arr[i] != 0){
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;

            }
            else if(arr[j] == 0){
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
