package Queue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void add(int val){

        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(val);

        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    public int top(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.peek();
    }

    public int remove(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return st1.pop();
    }

    public void display(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");

        }

        while (!st1.isEmpty()){
            int x = st1.pop();
            System.out.print(x +" ");
            st2.push(x);
        }

        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    public static void main(String[] args) {
            QueueUsingStack que = new QueueUsingStack();
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
