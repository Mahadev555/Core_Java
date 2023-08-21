package oop;


//abstraction in java
abstract class Animal{

    // this constructor automatically gets called after calling its child class object
    //this is called constructor channing

    Animal(){
        System.out.println("Animal created..");
    }

    //abstracted function
    //no need of implementation
    abstract void walk() ;
    public void eats(){
        System.out.println("Animals eats");
    }
}


class  Horse extends Animal{

    Horse(){
        System.out.println("Horse created..");
    }
    public void walk(){
        System.out.println("walks on 4 legs....");
    }
}


class Crow{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {

        // can not create object of Animal class



        Horse h1 = new Horse();
        h1.walk();

        // use all abstract class properties from its child class
        h1.eats();

        Crow c1 = new Crow();
        c1.walk();


    }
}
