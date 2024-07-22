package HashMaps;

import java.util.HashMap;

// Check given two Strings are Anagram or not
public class Question02 {
    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "lifhfhsten";

        if(s1.length() != s2.length()){
            System.out.println("False");
            return;
        }

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        HashMap<Character, Integer> mp1 = new HashMap<>();

        for(var el1: str1) {
            if(!mp1.containsKey(el1)){
                mp1.put(el1, 1);
            }
            else {
                mp1.put(el1 , mp1.get(el1)+1);
            }
        }

        for(var el2 : str2){
            if(mp1.containsKey(el2)){
                mp1.remove(el2);
            }
        }

        if(mp1.isEmpty()) System.out.println("True");
        else System.out.println("False");

//        char[] str2 = s2.toCharArray();
//        HashMap<Character, Integer> mp2 = new HashMap<>();
//
//        for(var el1: str2) {
//            if(!mp2.containsKey(el1)){
//                mp2.put(el1, 1);
//            }
//            else {
//                mp2.put(el1 , mp2.get(el1)+1);
//            }
//        }
//
//        if(mp1.equals(mp2)) System.out.println("True");
//        else System.out.println("False");


    }
}
