package Strings;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Manoranjan";

        char ch = name.charAt(5); // return character at index 5

        System.out.println(ch);

//        Accessing First and Last Character by Using the charAt() Method
        String name2 = "Soni";
        char first = name2.charAt(0);
        char last = name2.charAt(name2.length()-1);
        System.out.println(first +" "+ last);

//        Print Characters Presented at Odd Positions by Using the charAt() Method

        String name3 = "Welcome to Javatpoint";
        for(int i=0; i<name3.length(); i++){
            if(i%2 !=0){
                char ch1 = name3.charAt(i);
                System.out.println("Character present in "+ i + "is "+ch1);
            }
        }

//        Counting Frequency of a character in a String by Using the charAt() Method

        String name4 = "Welcome to Javatpoint portal";
        int count =0;
        for(int i=0; i<name4.length(); i++){
            if(name4.charAt(i) == 't'){
                count++;
            }
        }
        System.out.println("Frequency of t is "+count);
    }
}
