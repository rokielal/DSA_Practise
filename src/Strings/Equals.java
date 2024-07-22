package Strings;

public class Equals {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false this o/p is wrong bcz == only check the address of the string if address
//        address is equal it will give true else it will give false. So we should always use equals() to compare strings

        System.out.println(s1.equals(s3)); // true

    }
}
