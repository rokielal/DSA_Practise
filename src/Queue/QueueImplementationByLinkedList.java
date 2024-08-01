package Queue;

public class QueueImplementationByLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;

        }

    }
    public static class queueLL{

        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val){

            Node temp = new Node(val);

            if(size == 0){
                head = temp;
                tail = temp;

            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }

        public int remove(){

            if(size == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }

            int top = head.data;
            head = head.next;

            size--;
            return top;
        }

        void display(){

            if(size == 0) System.out.println("Queue is Empty!");
            else{
                Node curr = head;
                while (curr != null){
                    System.out.print(curr.data + " ");
                    curr = curr.next;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {

        queueLL q1 = new queueLL();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
    }
}
