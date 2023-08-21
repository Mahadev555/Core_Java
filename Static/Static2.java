package Static;

class Demo{
    static void disp1(){
        System.out.println("hii");
    }
}


// static method can be accesced ith or without object
public class Static2 {
    public static void main(String[] args) {
        Demo.disp1(); // run 1st


        Demo d = new Demo();
        d.disp1(); //run 2nd
    }
}
