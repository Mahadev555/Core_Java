package InterfaceLambdaFunction;

interface D{
    void drive();
}
public class Lambda {
    public static void main(String[] args) {
       // Lambda Experssion
        D obj = () -> System.out.println("Drive");
        obj.drive();
    }
}
