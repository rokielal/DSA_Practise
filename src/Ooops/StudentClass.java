package Ooops;

public class StudentClass {

    public static class Student{
         String name;
         int roll;
         double percent;
    }

    public static void change(Student x){

        x.name = "Rocky";
    }
    public static void main(String[] args) {

        Student x = new Student(); // decleration
        //initialiazation
        x.name = "Manoranjan";
        x.roll = 101;
        x.percent = 93.45;
        System.out.println(x.name);
        System.out.println(x.roll);
        System.out.println(x.percent);

//        After calling function
        change(x);
        System.out.println(x.name);

        Student x2 = new Student();
        x2.name = "Soni";
        x2.roll = 201;
        x2.percent = 95.3;
        System.out.println(x2.name);
        System.out.println(x2.roll);
        System.out.println(x2.percent);

//        x and x2 are objects of class Student
//        Objects are real life entities
//        classes are blueprint
//        It is advisible to create class outside the main
//        classes are pass by reference as we can change the value in the function




    }
}
