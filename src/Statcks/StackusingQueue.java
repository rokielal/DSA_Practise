package Statcks;

import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueue {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int val) {

        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }

        queue1.add(val);

        while (!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }

    public int pop(){
        if(queue1.isEmpty()){
            System.out.println("Stack is Empty no element to pop");
            return -1;
        }
        return queue1.remove();
    }

    public int peek() {
        if(queue1.isEmpty()){
            System.out.println("Stack is Empty no element to peek");
            return -1;
        }

        return queue1.peek();
    }

    public void display(){
        if (queue1.isEmpty()){
            System.out.println("Stack is Empty no element to display");
            return;
        }

        while (!queue1.isEmpty()){
            int top = (queue1.remove());
            queue2.add(top);
            System.out.print(top +" ");

        }


        while (!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }
    public static void main(String[] args) {
        StackusingQueue st = new StackusingQueue();

        st.display();
        st.push(10);
        System.out.println(st.peek());
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        st.display();
        System.out.println();
        System.out.println(st.pop());
        st.display();
        System.out.println();
        st.pop();
        st.display();
    }
}
