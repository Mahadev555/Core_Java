package Static;



public class Static1 {
    static int a;


    static{
        a = 5;
        System.out.println("a");   /// ruun 1st
    }

    public static void main(String[] args) {
        System.out.println("MAin Method"); // run 2nd
    }
}
