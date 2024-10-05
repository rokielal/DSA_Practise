package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringOfUniqueCharacter {
    public static void main(String[] args) {

        String s = "ABCDEFGABEF";

        int windowStart = 0;
        int windowEnd = 0;
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        int maxLen = Integer.MIN_VALUE;
        int len = 0;

        while(windowEnd < n){
            char ch = s.charAt(windowEnd);

            if(set.contains(ch)){
                while (windowStart < windowEnd && set.contains(ch)){
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            }
            set.add(ch);
            len = windowEnd - windowStart +1;
            maxLen = Math.max(maxLen, len);

            windowEnd++;
        }

        System.out.println(maxLen);
    }
}
