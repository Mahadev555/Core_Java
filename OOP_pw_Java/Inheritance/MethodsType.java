package OOP_pw_Java.Inheritance;



class Aeroplane{
    void fly(){
        System.out.println("Flying");
    }

    void takeoff(){
        System.out.println("tack off");
    }
}


class cargoplane{

    // fly() is not modified .: hence its ------ Inherited  ----------method


    void takeoff(){
        System.out.println("cargo takeoff");  //  overridden method
    }


    void speed(){
        System.out.println(" speed 50kmps");

        // specialized method
    }



}

public class MethodsType {


}
