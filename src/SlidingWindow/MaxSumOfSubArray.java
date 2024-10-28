package SlidingWindow;

public class MaxSumOfSubArray {

    public static int slidingApproach(int[] arr, int k){

        int sum =0;
        int maxSum = 0;
//        First find sum of k elements
        int index =0;
        while (index < arr.length && index < k){
            sum += arr[index];
            index++;
        }
        maxSum = sum;

        for(int i=1; i<arr.length - k; i++){
            int prevElement = arr[i-1];
            int nextElement = arr[i+k-1];

            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
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

        int ans = slidingApproach(arr, k);
        System.out.println("Optimized approach: " + ans);
    }
}
