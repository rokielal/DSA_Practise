package LinkedLists;

public class Problem01 {

    public static Node kthNodeFromEnd(Node head, int k){
//    This approach we are traversing the node two times
        int size =0;

        Node curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        int m = size - k +1;
        Node temp = head;
        for(int i=1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node kthNodeFromEnd2(Node head, int k){

        Node slow = head;
        Node fast = head;

        for(int i=1; i<=k; i++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static Node deleteKthNodeFromEnd(Node head, int k){

        Node slow = head;
        Node fast = head;

        for(int i=1; i<=k; i++){
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void display(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(40);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(5);
        Node f = new Node(20);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

//        Node ans = kthNodeFromEnd(a,1);
//        System.out.println(ans.data);
//
//        Node ans2 = kthNodeFromEnd2(a, 1);
//        System.out.println(ans2.data);

        display(a);
        a = deleteKthNodeFromEnd(a, 1);
        display(a);
    }
}

//https://drive.google.com/file/d/14heWSZJBc_-EJQ8M0l4Ft9toK_QgWjGq/view