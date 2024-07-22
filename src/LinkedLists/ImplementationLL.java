package LinkedLists;

public class ImplementationLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }


    }
    public static class linkedList{
        Node head = null;
        Node tail = null;

         void insertAtEnd(int val){
//            Creating a new node
            Node temp = new Node(val);
//            Checking if linkedlist is empty
            if(head == null){
                head = temp;
//                tail = temp;
            }
            else {
                tail.next = temp;
//                tail = temp;
            }
//            In both the case we are doing tail = temp, so we can write that outside if-else loop
             tail = temp;
        }

        void insertAtBegin(int val){
             Node temp = new Node(val);

             if(head == null){
//                 head = temp;
                 tail = temp;
             }
             else {
                 temp.next = head;

             }
//          In both the case we are doing head = temp, so we can write that outside if-else loop
            head = temp;
        }

         void display(){
             Node temp = head;
             while (temp != null){
                 System.out.print(temp.data + " ");
                temp = temp.next;
             }

        }

        int size(){
             Node temp = head;
             int count = 0;
             while (temp != null){
                 count++;
                 temp= temp.next;
             }
             return count;
        }

        void insertAtIndex(int index, int val){

             Node temp = new Node(val);
//             If we want to add any element at the last index of the ll than we have check the size and call the
//            function of insertAtEnd
            if(index == size()){
                insertAtEnd(val);
                return;
            }
//            If we want to add any element at the 0 index of the ll than we have check the size and call the
////            function of insertAtBegin
            else if(index == 0){
                insertAtBegin(val);
                return;
            }
//            Edge cases
            else if (index < 0 || index > size()) {
                System.out.println("Wrong index entered");
                return;
            }

            Node curr = head;
//             In this loop curr will go to index-1 and point to that node
             for(int i=0; i<index; i++){
                 curr = curr.next;
             }

//             Here first we will point temp.next to curr.next now both curr.next and temp.next will point
//            to same node next to curr than we will disconnect the curr node next and point to temp
             temp.next = curr.next;
            curr.next = temp;

        }
        int getElementAtIndex(int index){
             Node curr = head;
             for(int i=0; i< index; i++){
                curr = curr.next;
             }
             return curr.data;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
//        Doing insert from begning
        ll.insertAtBegin(3);
        ll.insertAtBegin(2);
        ll.insertAtBegin(1);

        ll.display();
        System.out.println();
        System.out.println("Size of linkedList: " + ll.size());

        ll.insertAtIndex(2,10);
        ll.display();
        System.out.println();
//        we can add at last index also
        ll.insertAtIndex(6,100);
        ll.display();
        System.out.println();
        System.out.println("last element is: " + ll.tail.data);

        System.out.println();
        ll.insertAtIndex(0,55);
        ll.display();
        System.out.println();
        System.out.println("first element is: " + ll.head.data);

        ll.insertAtIndex(-1,35);
        ll.insertAtIndex(10,35);

        System.out.println(ll.getElementAtIndex(5));

    }
}

