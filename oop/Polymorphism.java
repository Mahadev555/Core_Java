package oop;

class Parent{
    int a ;
    int b ;
    int c;
    public void add(int a, int b){
        int e = a+b;
        System.out.println("Addition is "+ e);
    }

    // compiletime  polymorphisam
    // method overloding
    public void add(int a, int b, int c){

        int d = a+b +c;
        System.out.println("Addition is "+ d);
    }
}


// Runtime polymorphism
// method overriding
class Chlid extends Parent{
    public void add(int a , int b, int c , int d){
        int f = a+ b+ c+d;
        System.out.println("addition "+f);
    }


}
public class Polymorphism {
    public static void main(String[] args) {


        Parent p1 = new Parent();
        p1.add(1,2);
        p1.add(2,3,4);

        Chlid c1 = new Chlid();
        c1.add(2,4,6,5);




    }

}
