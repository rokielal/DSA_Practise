package Queue;

public class QueueImplementationByLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static class queueLL{

        Node head = null;
        int size = 0;

        public void add(int val){

            Node temp = new Node(val);

            if(head == null){
                head = temp;
                temp.next = null;

            }
            else{
                Node curr = head;
                while (curr.next != null){
                    curr = curr.next;
                }
                temp = curr;
                temp.next = null;
            }
            size++;
        }

        void display(){

            if(head == null) System.out.println("Queue is Empty!");
            else{
                Node curr = head;
                while (curr != null){
                    System.out.print(curr.data + " ");
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
    }
}
