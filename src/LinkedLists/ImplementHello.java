package LinkedLists;

public class ImplementHello {

    public static class Node{
        char data;
        Node next;

        Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedList{
        Node head = null;

        void insert(char data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
            }
            else{
                Node curr = head;
                while(curr.next != null){

                    curr = curr.next;
                }
                curr.next = newNode;
            }
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        linkedList ll = new linkedList();

        for(int i=0; i<str.length(); i++){
            ll.insert(str.charAt(i));
        }
        ll.display();
    }
}
