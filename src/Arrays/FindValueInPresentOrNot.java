package Arrays;
import java.util.*;

//Given Q queries, check if the given number is present in the array or not.
//Note: Value of all the elements in the array is less than 10 to the power 5.
public class FindValueInPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//
        int N = 100005;
// creating a frequency array as of max size 10 to the power 5
        int[] freq = new int[N];

//        Here we are traversing the frequency array and in place of its index equal to arr element increasing the
//        value of that index by 1.  Initially in frequency array all elements are 0 but it will increase by 1
//        in index == arr[i]
//
        for (int i = 0; i < n; i++) {
            freq[arr[i]] = freq[arr[i]] + 1;
        }

//        Not required this loop just to check how freq array looks but size to too big
//        for (int i = 0; i < freq.length; i++) {
//            System.out.print(freq[i]+" ");;
//
//        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int val = sc.nextInt();

//            Here we are not traversing the freq array only checking if value found print Yes else No
            if (freq[val] > 0) {
                System.out.println("YES");
            } else System.out.println("NO");
        }


//      Optimize solution using hashset

//      HashSet<Integer> set = new HashSet<>();
//        for(int e : arr){
//            set.add(e);
//        }
//        int q = sc.nextInt();
//        while (q-- >0){
//            int val = sc.nextInt();
//
//            if(set.contains(val)) System.out.println("Yes");
//            else System.out.println("No");
    }
}
