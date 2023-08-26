package OOP_pw_Java.Inheritance;


class Human{
    int age;
    private int age1;
    void sleep(){
        System.out.println("slepping");
    }
}

class student extends Human{

}
public class Inheritance {

    public static void main(String[] args) {
        student s1 = new student();
        s1.sleep();

       // s1..age2  --------- private members can not inherited
        // constructor can not be inherited

    }
}
