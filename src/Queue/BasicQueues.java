package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueues {

    public static void display(Queue<Integer> q){

        Queue<Integer> helperQue = new LinkedList<>();

        while (q.size() != 0){
            System.out.print(q.peek() +" ");
            helperQue.add(q.remove());
        }
        System.out.println();
//        while (helperQue.size() != 0 ){
//            q.add(helperQue.remove());
//        }
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        display(q);
//        System.out.println(q);
//
//        System.out.println(q.size());
//
//        q.poll();
//        or
//        q.remove();

//        System.out.println(q);
//        System.out.println(q.size());
    }
}
