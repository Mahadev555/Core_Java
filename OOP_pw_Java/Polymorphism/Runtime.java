package OOP_pw_Java.Polymorphism;


class Aeroplane{
    void fly(){
        System.out.println("fly");
    }

}

class cargoP extends Aeroplane{
    void fly(){
        System.out.println("cargo flying");
    }
}

class passP extends Aeroplane{
    void fly(){
        System.out.println("PassP flying");

    }
}

public class Runtime {
    public static void main(String[] args) {
        cargoP cp = new cargoP();
        passP pp = new passP();

        Aeroplane ref;
        ref =  cp;
        ref.fly();
    }
}
