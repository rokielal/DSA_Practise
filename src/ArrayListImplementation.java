import java.util.ArrayList;

public class ArrayListImplementation {
    public static void main(String[] args) {

//        Syntax
        ArrayList<Integer> li = new ArrayList<>();

//        Add new element
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);

//        get an element at index i suppose index 3;
        System.out.println(li.get(3)); //8

//        print with for loop
        for(int i=0; i<li.size(); i++){
            System.out.print(li.get(i)+" "); //5 6 7 8
        }
//        printing the arraylist directly
        System.out.println();
        System.out.println(li); //[5, 6, 7, 8]

//        adding element at some index
//        suppose I need to add 100 at index 1 of li
        li.add(1,100);
        System.out.println("After adding 100 at index 1");
        System.out.println(li); //[5, 100, 6, 7, 8]

//        modifying element at index i
        li.set(2,200);
        System.out.println("After changing element at index 2 to 200");
        System.out.println(li); //[5, 100, 200, 7, 8]

//        removing element at index i
        li.remove(2);
        System.out.println("After removing element from index 2");
        System.out.println(li); // [5, 100, 7, 8]

//        removing an element
        li.remove(Integer.valueOf(100)); // this will return boolean if true than it will remove the element
        // else it will print the array as it is
        System.out.println(li); //[5, 7, 8]


//        Checking if an element exist
        li.contains(5); // this will also return boolean
        System.out.println(li.contains(5)); //true
        System.out.println(li.contains(15)); //false

//        Note: if we don't specify the class, we can put anything inside it like below
        ArrayList l2 = new ArrayList();

        l2.add("Manoranjan");
        l2.add(101);
        l2.add(true);
        l2.add(45.7);
        l2.add('G');

        System.out.println(l2); // [Manoranjan, 101, true, 45.7, G]




    }
}
