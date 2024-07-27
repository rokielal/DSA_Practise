package Statcks;

import java.util.Stack;

public class BasicsOfStatcks {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        System.out.println(st); //[5, 6, 7, 8]

        System.out.println(st.peek()); // 8 , this means in call-stack 8 is on the top and 5 is in bottom

        System.out.println(st.pop()); // 8 , it will remove element from top and print

        System.out.println(st); // [5, 6, 7], Now 8 is removed from the stack

        System.out.println(st.size()); //3 // it will print size of the stack

        System.out.println(st.isEmpty()); //false, // it will print true if stack is empty or false if stack is not empty

        int k= 1; // first element: o/p 7
//        int k = 2; // second element o/p 6
        while (st.size() > k){
            st.pop();
        }
        System.out.println("Element present is Kth position is: " + st.peek());
        System.out.println(st); // but as we are poping the element from stack all elements are getting deleted
    }
}
