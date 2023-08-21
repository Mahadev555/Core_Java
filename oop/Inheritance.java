package oop;

class Area{
    public void area(){
        System.out.println("Display area : ");
    }
}

//single level inheritance
class Traingle extends Area{
    public void area(int l , int h){
        System.out.println((1/2)*l*h);
    }
}


class Circle extends Area{


    public void area(int r){
        System.out.println((22/7)*r*r);


    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(3);

        Traingle t1 = new Traingle();
        t1.area(2,3);
    }




}
