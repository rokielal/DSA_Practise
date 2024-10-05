package SlidingWindow;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {100, 500, 300, 400};
        int k = 2;

        int maxSum = 0;

        for(int i=0; i<arr.length-k+1; i++){

            int sum =0;

            for(int j=i; j<i+k; j++){
                sum += arr[j];
            }
             maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
