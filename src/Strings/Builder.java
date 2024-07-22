package Strings;

public class Builder {
    public static void main(String[] args) {

//        StringBuilder str = new StringBuilder(); // by default capacity is 16
//        StringBuilder str = new StringBuilder(100); // implicit capacity we can adjust like 100 here
        StringBuilder str = new StringBuilder("Hello"); // directly putting value of str

        str.append("word");

        System.out.println(str);

//        We can change string in stringBuilder

        StringBuilder str2 = new StringBuilder("Hello");  // hello ---> Mello

        str2.setCharAt(0, 'M');

        System.out.println(str2);

//        We can insert and delete

        StringBuilder str3 = new StringBuilder("Hello"); // Hello ---> Heyllo size also changes

        str3.insert(2,'y');

        System.out.println(str3);

        str3.delete(2,3); // start idx, end idx-1
        System.out.println(str3);

        str3.deleteCharAt(2);

        System.out.println(str3);

//        Reversing a string

        StringBuilder str4 = new StringBuilder("Hello");

        str4.reverse();

        System.out.println(str4);
    }
}
