package Arrays;
import java.util.*;

//Find the unique number in a given array where all the elements are repeated twice with one value
//being unique.
public class FindUniqueElement {
    public static void unique(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int el : arr){
            if(!mp.containsKey(el)){

                mp.put(el,1);
            }else{
                mp.put(el,mp.get(el)+1);
            }
        }
//        System.out.println(mp);

        HashMap<Integer,Integer> mp2 = new HashMap<>();

//        Traversing the map
        for(var el1 : mp.entrySet()){
            if(el1.getValue() == 1){
                mp2.put(el1.getKey(), 1);
                int ans = el1.getKey();

                System.out.print(ans +", ");
            }

        }
        System.out.println(mp2);
        System.out.println("Storing unique in map2 and printing then");
        for(var el2: mp2.entrySet()){
            System.out.print( el2.getKey() +", ");
        }

    }
    public static void main(String[] args) {
        int[] arr ={21,7,3,21,5,7,5,1,9};

        unique(arr);

    }
}
