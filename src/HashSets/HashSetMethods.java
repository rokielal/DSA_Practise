package HashSets;
import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();

        str.add("Manoranjan");
        str.add("Soni");
        str.add("Ivanshika");
        str.add("Manoranjan");

        System.out.println(str); // Manoranjan, Soni, Ivanshika
        System.out.println(str.contains("Soni")); // true
        System.out.println(str.size()); //3
        str.remove("Manoranjan");
        System.out.println(str);
        System.out.println(str.contains("Manoranjan")); // false
        System.out.println(str.size()); //2

//        Traversing
        for(String s : str){
            System.out.println(s);
        }

        for(var s : str){
            System.out.println(s);
        }
    }
}
