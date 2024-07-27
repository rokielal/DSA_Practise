package Statcks;
public class StackImplementationByArray {

    public static class Stack{
        int idex = 0;
        int[] arr = new int[6];
        void push(int x){
//            if(isFull()) // 0r
            if(idex == arr.length){
                System.out.println("Stack is Full");
                return;
            }
            arr[idex] = x;
            idex++;
        }
        int peek(){
             if(idex == 0){
                 System.out.println("Stack is Empty");
                 return -1;
             }
             return arr[idex -1];
        }

        int pop(){
            if(idex == 0){
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = arr[idex-1];
            arr[idex-1] = 0;
            idex--;
            return top;
        }

        void display(){
            for(int i=0; i<idex; i++){
                System.out.print(arr[i]+ " ");
            }
        }

        int size(){
            return idex;
        }

        boolean isEmpty(){
            if(idex == 0){
                return true;
            }
            return false;
        }

        boolean isFull(){
            if(idex == arr.length) return true;
            else return false;
        }

        int search(int val){
          for(int i=0; i<idex; i++){
              if(arr[i] == val) {
                  return i;
              }
          }
          return -1;
        }
    }
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        int x =st.pop();
        System.out.println();
        System.out.println(x); // top element is 4
        st.display();
        System.out.println();
        System.out.println(st.peek()); // Now the top element is 3
        st.push(5);
        st.push(6);
        st.push(7);
        st.display();
        System.out.println();
        System.out.println(st.size()); // 6
        System.out.println(st.isFull()); // true
//        st.push(9); // here stack is full
        System.out.println(st.search(9));;
    }
}
