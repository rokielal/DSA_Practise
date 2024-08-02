package LinkedLists;

public class Problem03 {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static int findIntersaction(Node headA, Node headB){

//        while (head1 != null){
//
//            Node temp = head2;
//
//            while (temp != null) {
//                if (head1 == temp) return head1.data;
//
//                temp = temp.next;
//            }
//            head1 = head1.next;
//        }
//
//        return -1;
        Node temp1 = headA;
        while (temp1 != null) {
            Node temp = headB;
            while (temp != null) {
                if (temp1.data == temp.data) {
                    return temp1.data;
                }
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node a1 = new Node(100);
        Node b1 = new Node(40);
        Node c1 = new Node(30);
        Node d1 = new Node(90);
        Node e1 = new Node(50);

        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;

        Node a2 = new Node(10);
        Node b2 = new Node(60);
        Node c2 = new Node(30);


        a2.next = b2;
        b2.next = c2;

        System.out.println(findIntersaction(a1,a2));

    }
}
