package OOP_pw_Java.Constructor;


class  student2{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    student2(int age){
        this.age = age;
    }

    student2(String name){
        this.name = name;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {

        student2 s = new student2(18);
        student2 s1 = new student2(" Rahul");

        int Age = s.getAge();
        String Name = s1.getName();

        System.out.println(Age + Name);

    }
}
