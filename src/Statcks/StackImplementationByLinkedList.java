package Statcks;

public class StackImplementationByLinkedList {

//    Node head = null;
//    int size = 0;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{

        Node head = null;
        int size = 0;
//
//        class Node{
//            int data;
//            Node next;
//
//            Node(int data){
//                this.data = data;
//                this.next = null;
//            }
//        }

        void push(int val){

//            Create a new Node
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek(){
            if(head == null) {
                System.out.println("No Element to print");
                return -1;
            }
            else{
                return head.data;
            }
        }

        int pop(){
            int top =-1;
            if(head == null) System.out.println("No element to Pop");
            else{
                 top = head.data;
                head = head.next;
                size--;

            }
            return top;
        }
        void display(){
            if(head == null) System.out.println("No Element to display");
            else{
                Node curr = head;

                while (curr != null){
                    System.out.print(curr.data + " ");
                    curr = curr.next;
                }
            }

        }

        void search(int val){
            if(head == null) System.out.println("No element to search");
            else{
                Node curr = head;

                while (curr != null){

                    if(curr.data == val){
                        System.out.println(curr.data);
                    }
                    curr = curr.next;
                }
            }
        }

    }
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();   //4 3 2 1  ; Here top will be 4 as in Stack element enter in the last is at the top and
//        we are pushing 4 at the last, so that we have access of top which we maintained as head in our alogorithm
        System.out.println();
        System.out.println(st.peek());

        System.out.println(st.size);
        System.out.println(st.pop());
        st.display();
        System.out.println();
        System.out.println(st.size);
        st.search(2);
    }
}
