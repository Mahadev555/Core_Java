package OOP_pw_Java.Encapsulation;



class Stu1{

    private int age;
    private String name;


    // used to set values for age and name
    public void set(int age,String name){
//        age = age;  ----->  gives no output i.e Shadowing Problem

        //hence

        this.age = age;
        this.name = name;
    }

    public void show(){
        System.out.println(age);
        System.out.println(name);
    }

}

public class ShadowingP {
    public static void main(String[] args) {
        Stu1 st1 = new Stu1();
        st1.set(2,"rahul");
        st1.show();
    }
}
