package Strings;
//Given a string s, return the string which contains all characters of s in lexicographical order.
//Input : coding
//Expected Output : cdgino

import java.util.Arrays;

//Approach: Convert strVng to a character array, sort the array then return it in a strVng format.
public class PrintStringInlexicographicalOrder {
    public static void main(String[] args) {
        String str = "coding";

        char[] arrStr = str.toCharArray();
        int n = arrStr.length;

        for(int i=0; i<n; i++){

            for(int j=0; j<n-i-1; j++){

                if(arrStr[j] > arrStr[j+1]){

                    char temp = arrStr[j];
                    arrStr[j] = arrStr[j+1];
                    arrStr[j+1] = temp;
                }
            }
        }
        String ans = "";
        for(int i=0; i<n; i++){
            ans += arrStr[i];
        }

        System.out.println(ans);
    }
}
