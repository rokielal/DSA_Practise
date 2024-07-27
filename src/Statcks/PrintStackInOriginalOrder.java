package Statcks;

import java.util.Stack;

public class PrintStackInOriginalOrder {

    public static void printReverseRecurrsively(Stack<Integer> st){

        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top +" ");
        printReverseRecurrsively(st);
        st.push(top);

    }
    public static void printInSameOrderRecursively(Stack<Integer> st){

        if(st.isEmpty()) return;
        int top = st.pop();

        printInSameOrderRecursively(st);
        System.out.print(top +" ");
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//       Approach 1: To print we have to create another Stack and push all element to its and remove from original Stack
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 0){
            temp.push(st.pop());
        }

        while (temp.size() > 0){
            System.out.print(temp.peek() +" ");
            st.push(temp.pop());
        }

        System.out.println();
//        Approach 2:  By using array

        int n = st.size();
        int[] arr = new int[n];

        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }

        for(int i=0; i<n; i++){
            System.out.print( arr[i] + " ");
            st.push(arr[i]);
        }

        System.out.println();
        printReverseRecurrsively(st);
        System.out.println();
        printInSameOrderRecursively(st);
    }
}
