package Queue;

public class QueueImplementationInArray {

    public static class queueArr {
        int front = -1;
        int rear = -1;

        int size = 0;
        int[] arr = new int[100];

        public void add(int val){
            if(rear == arr.length-1) {
                System.out.println("Queue is Full");
                return;
            }
            if(front == -1) {
                front = rear = 0;
                arr[0] = val;
            }

            else {
                arr[++rear] = val;

            }
            size++;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }

        public int peek(){
            return arr[front];
        }

        public void display(){
            if(size == 0) System.out.println("Queue is Empty!");
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

            queueArr q1 = new queueArr();

//            q1.display();
            q1.add(1);
            q1.add(2);
            q1.add(3);
            q1.add(4);
            q1.add(5);

            q1.display();
            System.out.println(q1.size);
            q1.remove();
            q1.display();
        System.out.println(q1.peek());
    }
}
