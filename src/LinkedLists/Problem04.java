package LinkedLists;

public class Problem04 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node findMiddleElement(Node head){

            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            }

            return slow;
        }

        public static void deleteMiddleElement(Node head){

            Node fast = head;
            Node slow = head;

            if(head.next == null ) {
                System.out.println("LL has one element");
                return;
            };
            while (fast.next.next !=null && fast.next.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            slow.next = slow.next.next;
        }

        public static void display(Node head){
            Node temp = head;

            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


    public static void main(String[] args) {
        Node a1 = new Node(100);
//        Node b1 = new Node(40);
//        Node c1 = new Node(30);
//        Node d1 = new Node(90);
//        Node e1 = new Node(50);
//        Node f1 = new Node(70);

//        a1.next = b1;
//        b1.next = c1;
//        c1.next = d1;
//        d1.next = e1;
//        e1.next = f1;

         Node mid = findMiddleElement(a1);
        System.out.println(mid.data);
        display(a1);
        deleteMiddleElement(a1);
        display(a1);
    }
}
