package Static;


class Demo2{
    static int a;
    int b;

    static {
        a = 5;
        System.out.println("static" );
    }

    {
        b = 10;
        System.out.println("Non-Static"  );
    }

    static void disp1(){
        System.out.println(a);

    }

    void disp2(){
        System.out.println(b);
    }


}
public class Static3 {
    public static void main(String[] args) {
        Demo2.disp1();

        Demo2 D = new Demo2();
        D.disp2();
    }

}
