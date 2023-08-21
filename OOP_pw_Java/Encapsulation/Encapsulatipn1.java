package OOP_pw_Java.Encapsulation;


class Stu{
    private int age;
    private String name;


    // used to set values for age and name
    public void set(int i,String n){
        age = i;
        name = n;
    }

    public void show(){
        System.out.println(age);
        System.out.println(name);
    }
}

public class Encapsulatipn1 {

    public static void main(String[] args) {
        Stu st = new Stu();
        st.set(2,"rahul");
        st.show();
    }

}
