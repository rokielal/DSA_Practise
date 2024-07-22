package LinkedLists;

public class BasicLL {
    public static class Node{
        int data; // Value (it can be of any datatype based on question)
        Node next; // it will store the address of next node

//        Constructor
        Node(int data){
            this.data = data;
        }

    }

    public static void display(Node head){

        Node temp = head;
//        int count =  0;
        while (temp != null){
//            count++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
//        System.out.println();
//        System.out.println("The length of LL is: " + count);
    }

    public static void displayUsingRecursion(Node head){
        Node temp = head;

//        base case
        if(temp == null) return;

//        Our work
        System.out.print(temp.data + " ");
//        Calling recursive
        displayUsingRecursion(temp.next);
    }

    public static void displayUsingRecursionInReverse(Node head){
        Node temp = head;

        if(temp == null) return;

        displayUsingRecursionInReverse(temp.next);
        System.out.print(temp.data + " ");

    }

    public static int countLength(Node head){

        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
//        Node x = new Node();
//        System.out.println(x.data); // 0,  as value of data is not provided
//        System.out.println(x.next); // null, as next address is not defined

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(2);
        Node e = new Node(9);
        Node f = new Node(100);

//        5 3 8 2 9 // here no one is connected to each other
        a.next = b;  //  5-> 3 8 2 9
        b.next = c;  //  5-> 3-> 8 2 9
        c.next = d; //  5-> 3-> 8-> 2 9
        d.next = e; //  5-> 3-> 8-> 2-> 9
        e.next = f;

//        If we want to print the data of b and we so we can do that by
//        System.out.println(b.data);
//        System.out.println(a.next.data);

//        Traverse a linked list

        // create a Node and assign head to it here head is a
        Node temp = a;

//        for(int i=1; i<=5; i++){
//            System.out.print(temp.data +" ");
//            temp = temp.next;
//        }
//        In general we won't know how many times the loop will run, so we can use while loop and give the
//        condition that when temp.next points to null end the loop

        System.out.println("Printing linked list in main method: ");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Printing linked list using function call: ");
        display(a);

        System.out.println();
        System.out.println("Printing linked list using recursion: ");
        displayUsingRecursion(a);

        System.out.println();
        System.out.println("Printing linked list using recursion in reverse order: ");
        displayUsingRecursionInReverse(a);

        System.out.println();
        System.out.println("Function to count length of linked list: ");
        System.out.println(countLength(a));;
    }
}
