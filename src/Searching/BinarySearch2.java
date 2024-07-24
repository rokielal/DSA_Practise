public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {32,23,21,19,16,14,8,2};
        int target = 8;

        System.out.println(descendingBinarySearch(arr, target));
    }
    //    Check element present or not if we have an array sorted in ascending order

    public static int descendingBinarySearch (int [] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                end = mid -1;
            }
            else if(target < arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
