package Arrays;
import java.util.*;

//Find the total number of pairs in the array whose sum is equal to the given value x.
public class FindPaidSumEqualToX {

    public static int findPairSum(int[] arr, int x){
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for(int i=0; i<arr.length; i++){
//          here we are taking the difference between x-each element in array
            int difference = x - arr[i];

//            here we are checking if map contains the difference than we can increase the (count + the value
//            of difference in map)

            if(map.containsKey(difference)){
                count = count + map.get(difference);
            }
//          here we are putting the element is key, value pair, if the value is already present than we adding 1
//            to it, if it is not present tha we are setting its value to 1

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
//        This is to print the key, value in map(not required)
        System.out.println(map);

        return count;
    }


    public static void main(String[] args) {
        int[] arr = {4,7,3,21,6,5,5};
        int x = 10;

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]+arr[j] ==x){
                    cnt++;
                }
            }
        }
        System.out.println("Finding sum pair using BruteForce approach: " +cnt);
        System.out.println("------------------------");
        int ans = findPairSum(arr,x);
        System.out.println("Finding pair sum using HashMap: " + ans);

    }
}
