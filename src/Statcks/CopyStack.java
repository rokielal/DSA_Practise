package Statcks;
import java.util.*;

// Copy contents of one Stack to another in same order
public class CopyStack {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//
//        int n = sc.nextInt();
//
//        for(int i=0; i<n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//
//        System.out.println(st);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

//        reversing
        Stack<Integer> rt = new Stack<>();

//        while (st.size() > 0){
//           int x = st.peek();
//           rt.push(x);
//           st.pop();
//        }
//        System.out.println("Reversed Stack: " + rt);

//        Short form
        while (st.size() > 0){
            rt.push(st.pop()); // as pop will return that value and than remove it from stack
        }

        System.out.println("Reversed Stack: " + rt);

//        Again reversing rt stack

        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0){
            gt.push(rt.pop()); // as pop will return that value and than remove it from stack
        }

        System.out.println("Element from from st Stack to gt Stack in same order: " + gt);
    }
}
