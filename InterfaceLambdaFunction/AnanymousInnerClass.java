package InterfaceLambdaFunction;

interface Car{
    void drive();
}

public class AnanymousInnerClass {
    public static void main(String[] args) {

        // Object of new unnamed class
        // this class is called as Ananomous class
        Car A = new Car() {
            @Override
            public void drive() {
                System.out.println("Driving");
            }
        };
        A.drive();

    }

}
