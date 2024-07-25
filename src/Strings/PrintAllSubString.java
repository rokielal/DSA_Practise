package Strings;

//    Print all substring of the given string:
//    str = "abcd"
//    output = a ab abc abcd b bc bcd c cd d
public class PrintAllSubString {
    public static void main(String[] args) {
        int originalNum = 1234;
        String str = String.valueOf(originalNum);


//        String str = "abcd";

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j <= str.length(); j++){

                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
