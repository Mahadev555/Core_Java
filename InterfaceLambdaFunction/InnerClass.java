package InterfaceLambdaFunction;

class C{
    void show(){
        System.out.println("show");
    }
    class B{
        void displaay(){
            System.out.println("display");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        C obj = new C();
        C.B obj1 = obj.new B();

        obj.show();
        obj1.displaay();
    }
}
