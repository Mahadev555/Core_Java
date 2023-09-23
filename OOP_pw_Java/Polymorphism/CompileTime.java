package OOP_pw_Java.Polymorphism;


class OverLoading{
    int sum(int a ,int b){
        return a+b;

    }
    // this is overloading
    int sum(int a ,int b,int c){
        return a+b+c;

    }
}
public class CompileTime {
    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        o.sum(2,3);
        o.sum(3,4,5);
    }
}
