package OOP_pw_Java.AbstractClassMethods;


abstract class Areoplane2{
    abstract void run();
        }

        class plane extends Areoplane2{
    void run(){
        System.out.println("running");
    }
        }

public class AbstractClass {
    public static void main(String[] args) {
        plane p1 = new plane();
        p1.run();
    }
}
