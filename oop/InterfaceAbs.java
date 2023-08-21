package oop;


interface Animal1{
    // can not create constructor
    //  can not create method with body;
    public void walk();

}

interface Herbivore{

}


class Student{
    String name;

    // static used to save mem ory and used to create things only once
    static String school;

    public static void changeSch(){
        school = "NewSchool";
    }
}

// multiple inheritance //
// only possible in inheritance
class Horse1 implements Animal1,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs..");
    }
}
public class InterfaceAbs {
    public static void main(String[] args) {

        Horse1 h1 = new Horse1();
        h1.walk();

        // can access static things without creating objets
        Student.school = "SVM";

        Student s1 = new Student();
        s1.name = "ram";
        System.out.println(Student.school);

    }
}
