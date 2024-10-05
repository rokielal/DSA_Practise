package SlidingWindow;

public class longestSubStringOfUniqueKelement {
    public static void main(String[] args) {

        String s = "aabaaaaacbebbebe";
        int k = 3;

        int n = s.length();
        int windowStart = 0;
        int windowEnd = 0;
        int len=0;
        int maxLen = Integer.MIN_VALUE;
        int[] freqArr = new int[26];
        int uniqueCharCount = 0;

        while (windowEnd <n){
            int index = s.charAt(windowEnd) - 97;

            if(freqArr[index] == 0){
                uniqueCharCount++;
                freqArr[index]++;
            }
            else{
                freqArr[index]++;
            }
            if(uniqueCharCount == k){
                len = windowEnd - windowStart +1;
                maxLen = Math.max(maxLen, len);
            }
            else if(uniqueCharCount > k){
                while (windowStart < windowEnd && uniqueCharCount > k){
                    index = s.charAt(windowStart) - 97;
                    windowStart++;
                    freqArr[index]--;

                    if(freqArr[index] == 0){
                        uniqueCharCount--;
                    }


                }
            }

            windowEnd++;
        }
        System.out.println(maxLen);
    }
}
