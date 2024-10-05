package HashSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {2,8,2,6,-6,3,2};

//        boolean found = checkSumArray(arr,5);
//        System.out.println("Found --> " + found);
//
//        ArrayList<Integer> res = findSubArray(arr, 5);
//
//        if(res.get(0) == -1){
//            System.out.println("Not found");
//        }
//        else {
//            System.out.println(res.get(0)+ ","+ res.get(1));
//        }
        int ans = findLongestSumArray(arr, 5);
        System.out.println(ans);
    }

    public static boolean checkSumArray(int[] arr, int k){

        HashSet<Integer> set = new HashSet<>();
        set.add(0); // x==k

        int sum =0 ;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            int rem = sum -k;
            if(set.contains(rem)){
                return true;
            }
            else{
                set.add(sum);
            }
        }
        return true;
    }

    public static ArrayList<Integer> findSubArray(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1); // no answer found;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            int rem = sum - k;

            if(map.containsKey(rem)){
                int firstIndex = map.get(rem) +1;
                list.set(0, firstIndex);
                list.add(i);
                break;
            }
            else{
                map.put(sum, i);
            }
        }

        return list;
    }

    public static int findLongestSumArray(int[] arr, int k){
        int maxLength = 0;

        HashMap<Integer, Integer> myMap = new HashMap<>();

        myMap.put(0, -1);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            int rem = sum - k;
            if(myMap.containsKey(rem)){

                int len = i - myMap.get(rem);
                maxLength = Math.max(maxLength, len);
            }
            if(!myMap.containsKey(sum)){
                myMap.put(sum, i);
            }
        }
        return maxLength;
    }
}
