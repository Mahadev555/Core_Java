package oop;

class Boy{
    String name ;
    int age;
    void info(){
        System.out.println(this.name+" "+this.age);
    }

    // Constructor
    Boy(String name,int age){
        this.name =  name;
        this.age = age;
    }
}


public class ClassnObj {
    public static void main(String[] args) {

        // object calling
        Boy b1 = new Boy("rahul", 23);
        b1.info();

    }
}
