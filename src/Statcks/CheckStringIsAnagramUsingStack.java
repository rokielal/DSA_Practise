package Statcks;
import java.util.*;
public class CheckStringIsAnagramUsingStack {
    public static void main(String[] args) {
        String str = "madwm";

//        Create a stack with each character of string
        Stack<Character> st = new Stack<>();
//        Insert the stack with string character
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

//        Create a stringBuilder of reversed string using stack
        StringBuilder revStr = new StringBuilder();
        while(!st.isEmpty()){
            revStr.append(st.pop());
        }

//        Convert StringBuilder revStr to String
        String revStr1 = revStr.toString();

        if(str.equals(revStr1)) System.out.println("Anagram");

        else System.out.println("Not Anagram");
    }
}
