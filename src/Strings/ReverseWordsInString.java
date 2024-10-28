package Strings;
import java.util.*;
public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "I.Love.My.Country";
        StringBuilder sb = new StringBuilder();
        int start = str.length()-1;


        while(start >= 0){

            while(start >=0 && str.charAt(start) == '.'){
                start--;
            }
            if(start < 0 ) break;
            int end = start;

            while(start >=0 && str.charAt(start) != '.'){
                start--;
            }

            if(sb.isEmpty()){
                sb.append(str.substring(start+1, end+1));
            }else{
                sb.append('.');
                sb.append(str.substring(start+1, end+1));
            }
        }
        String newString = sb.toString();

        System.out.println(newString);
    }
}
