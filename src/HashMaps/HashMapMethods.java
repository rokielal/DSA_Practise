package HashMaps;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
//        Syntax
        Map<String, Integer> mp = new HashMap<>();

//        Adding Element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

//        Getting value of a key from the HashMap
//        Get will return value if it exist else it will return null

        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

//        Changing/Updating value of a key in the HashMap
        mp.put("Akash", 25); //
        // it will change the value of Akash to 25 because in HashMap
        // we cannot store two Key of same name
        System.out.println(mp.get("Akash")); // 25

//        Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));//25
        System.out.println(mp.remove("Akash"));//null

//        Checking if key exist in HashMap
        System.out.println(mp.containsKey("Akash")); // fasle
        System.out.println(mp.containsKey("Yash")); // true

//        Adding a new entry only if the new key does not exist already
//        Two ways to do :
//        1: Using contains and put together
        if(!mp.containsKey("Yash")) mp.put("Yash", 40);

//        2:Using method putIfAbsent
        mp.putIfAbsent("Yashika", 30); // will enter as it is not present
        mp.putIfAbsent("Yash", 30); // will not enter as it is already present

//        Get all the keys in HashMap: keySet() is used to get all the keys in map
        System.out.println(mp.keySet());

//        Get all the values in HashMap: values() is used to get all the values in map
        System.out.println(mp.values());

//        Get all the entries in the map: entrySet() is used to get all the entries in map
        System.out.println(mp.entrySet());

//        Traversing all the entries of HashMap - multiple method
//        1:Using forEach loop
        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();

//        2: Using in Map.Entry
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
//        More simpilier syntax
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
        }





    }
}
