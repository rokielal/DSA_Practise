package Strings;
import java.util.*;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
// removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
public class CheckPhraseIsPalindrome {
    public static void main(String[] args) {
        String s = "A man,  a plan, a canal: Panama";

//      "\\s" removes all spaces
//        String str1 = s.replaceAll("\\s","");
//        System.out.println(str1);
//
////        "\\W" removes all non-character
//        String str2 = str1.replaceAll("\\W","");
//        System.out.println(str2);
//
////        Combining both in one line
//        String str3 = s.replaceAll("\\s","").replaceAll("\\W","");
//        System.out.println(str3);
//
////        Convert all to lower case
//        String str4 = str3.toLowerCase();
//        System.out.println(str4);

//        Combining all in one line
        String str5 = s.replaceAll("\\s","").replaceAll("\\W","").toLowerCase();
        System.out.println(str5);

        StringBuilder sb = new StringBuilder();

//        for(int i=0; i<str5.length(); i++){
//            sb.append(str5.charAt(i));
//        }
//
//        System.out.println(sb);
//        String newStr = sb.reverse().toString();
//        System.out.println(newStr);
//        if(newStr.equals(str5)) System.out.println("True");
//
//        else System.out.println("False");

        char[] newStr = str5.toCharArray();

        for(int i=0; i<newStr.length; i++){
            sb.append(newStr[i]);
        }
                System.out.println(sb);

        String sbReverse = sb.reverse().toString();

        if(sbReverse.equals(str5)) System.out.println("true");
        else System.out.println("false");

    }
}
