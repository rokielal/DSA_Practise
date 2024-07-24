public class BinarySearch {

    public static void main(String[] args) {

        int[] arr= {2,4,6,7,8,9,10};
        int target = 11;
        System.out.println(ascendingBinarySearch(arr,target));

    }

//    Check element present or not if we have an array sorted in ascending order
    public static int ascendingBinarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
//        int mid = (start + end) /2 ;

        while (start <= end){

//            Find the middle element
//            int mid = (start + end) /2 ; // might be possiblity that
            //(start + end) exceeds the range of int in java

            int mid = start + (end - start) / 2; // this is the better way

//            if(arr[mid] == target){
//                return mid;
//            }
//
//            else if(arr[mid] < target){
//                start = mid +1;
//            }
//            else {
//                end = mid - 1;
//            }

//            OR
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
// Steps :
// Binary search works on sorted array
//