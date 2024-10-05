package Queue;

import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingStack2 {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void add(int val){
        st1.push(val);
    }

    public int remove(){

        if(st1.isEmpty()){
            System.out.println("Queue is Empty, no element to remove");
            return -1;
        }

        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        int x = st2.pop();

        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }

        return x;
    }

    public int top(){

        if(st1.isEmpty()){
            System.out.println("Queue is empty, no element at top");
            return -1;
        }

        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int x = st2.peek();

        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }

        return x;
    }

    public void display(){
        if(st1.isEmpty()){
            System.out.println("Queue to Empty, no element to display");
        }

        while (!st1.isEmpty()){
            int x = st1.pop();
            st2.push(x);
            System.out.print(x +" ");
        }
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    public static void main(String[] args) {
        QueueUsingStack2 que = new QueueUsingStack2();
//        Queue<Integer> que = new LinkedList<>();
        que.display();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);

        que.display();
        System.out.println();

        System.out.println(que.top());

        System.out.println(que.remove());

        que.display();
    }
}
