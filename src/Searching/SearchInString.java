public class SearchInString {
    public static void main(String[] args) {

        String str = "Manoranjan";
        char target = 'm';
        boolean ans = stringSearch(str, target);
        System.out.println(ans);

    }
    public static boolean stringSearch(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
