package HashSets;

import java.util.HashSet;

//Q2. Given an unsorted array of integers nums, return the length of the longest consecutive elements
//sequence.
//Input1:
//n = 6
//nums = [100,4,200,1,3,2]
//Output1:
//4
//Input2:
//n = 10
//nums = [0,3,7,2,5,8,4,6,0,1]
//Output2:
//9
public class Question01 {
    public static void main(String[] args) {

//        int[] nums = {100,4,200,1,3,2};
        int[] nums = {0,3,7,2,8,4,6,0,1};

        HashSet<Integer> set = new HashSet<>();

        for(int e : nums){
            set.add(e);
        }

//        Now traverse in set

        int maxStreak = 0;
        for(int num : set){

            if(!set.contains(num-1)){ // num is staring point of a sequence

                int currNum = num;
                int currStreak = 1; // length of current consecutive sequence

                while (set.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }

                maxStreak = Math.max(maxStreak,currStreak);
            }


        }
        System.out.println(maxStreak);
    }
}
