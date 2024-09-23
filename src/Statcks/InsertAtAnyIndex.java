package Statcks;

import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};


        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);

        for(int i=0; i<arr.length; i++){
            st.push(arr[i]);
        }

        System.out.println("Original Stack: " + st);

//        Inserting any element n in kth position
        Stack<Integer> temp = new Stack<>();
        int k = 3;
        int n = 100;

        while (st.size() > k){
            temp.push((st.pop()));
        }
        st.push(n);
        while (temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println("Inserted Stack: " + st);

    }
}
