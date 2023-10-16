package InterfaceLambdaFunction;


interface A {
    void show();
   default void defaultM(){
       System.out.println("cll");
    }
}

interface B{
    void abc();
}

class X implements A,B{
    public void show(){
        System.out.println("showing");

    }
    public void abc(){
        System.out.println("abc");
    }
}
public class Interface {
    public static void main(String[] args) {
        A obj = new X();
        B obj1 = new X();
        obj1.abc();
        obj.show();
    }
}
