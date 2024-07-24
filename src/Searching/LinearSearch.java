public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,3,5,22,43,8,10,23};

        System.out.println(linearSearch(arr,43));

    }

    public static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){

            if(arr[i] == target){

                return i;
            }
        }
        return -1;
    }
}
