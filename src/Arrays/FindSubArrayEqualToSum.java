package Arrays;
//- Given an unsorted array A of size N that contains only non-negative integers, find a
//continuous sub-array which adds to a given number S.
//In case of multiple subarrays, return the subarray which comes first on moving from left
//to right.
//You need to print the start and end index of answer subarray.
public class FindSubArrayEqualToSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,7,5};
        int sum = 15;

        int i = 0;
        int j = 0;
        int CurrSum =0;
        int n = arr.length;

        while(j < n){
//        // Add the current element to currentSum
            CurrSum += arr[j];


//                 Move the start pointer to the right to maintain the target sum
                while(CurrSum > sum && i < j){
                    CurrSum -= arr[i];
                    i++;
                }

            // Check if we found the target sum
            if(CurrSum == sum){
                System.out.print("Sub-array found from index: " + i +" to "+ j);
                System.out.println();
                break;
            }
            // Move to the next element
            j++;

        }
        // If no sub-array is found
        if(CurrSum != sum){
            System.out.print("No sub-array found");
            System.out.println();
        }



    }
}
