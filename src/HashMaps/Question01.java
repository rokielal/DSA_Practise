package HashMaps;
// Given an array find the most frequent element in it. If there are multiple elements that appear maximum number of
// times, print any one of them

import java.util.*;

//input -arr[] ={1,2,3,1,4,1,6}
//o/p =1
public class Question01 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,1,6,3,8,6,2,5,3};

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], 1);
            }else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }


//        for(int el : arr){
//            if(!mp.containsKey(el)){
//                mp.put(el, 1);
//            }else{
//                mp.put(el,mp.get(el) + 1 );
//            }
//        }
        System.out.println(mp.entrySet());

        int maxFreq = -1;
        int ans = -1;
//        for(Map.Entry<Integer, Integer> el: mp.entrySet()){
//            if(el.getValue() > maxFreq){
//
//                maxFreq = el.getValue();
//                ans = el.getKey();
//            }
//
//        }

//        for(var el : mp.entrySet()){
//            if(el.getValue() > maxFreq){
////
//                maxFreq = el.getValue();
//                ans = el.getKey();
//            }
//        }

//        If we traverse through key only and we can get the value of key if we know the key
        for(var key: mp.keySet()){
            if(mp.get(key) > maxFreq){
                maxFreq = mp.get(key);
                ans = key;
            }
        }

        System.out.println(ans);
        System.out.printf("%d has maximum frequency and it occurs %d times", ans, maxFreq);
    }
}
