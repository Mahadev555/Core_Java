public class Main {
    int a =6 ;

    public void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Main b = new Main();
        b.hello();

        hello h = new hello();
        h.bv = 6;
        System.out.println();

    }
}

class hello{
    public int bv = 8;
}
