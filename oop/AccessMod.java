package oop;
class Info{

    // accessed by every obejct
    public String name;

    // accessed by only subclass outside package
    protected int id;

    //accessed within class only
    // if Want to access outside class
    //use getters & setters
    private String password;

    //getters
    public String getPass(){
        setPass("abcd");
        return this.password;
    }

    //setters
    private void setPass(String Pass){
        this.password = Pass;
    }
}
public class AccessMod {

    public static void main(String[] args) {

        Info i1 = new Info();
        i1.name = "Atharv";
        i1.id= 123;

        // Cannot access password
//        i1.password = "abcd";

        System.out.println(i1.getPass());

    }
}
