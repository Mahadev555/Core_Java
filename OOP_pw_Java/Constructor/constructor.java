package OOP_pw_Java.Constructor;

class Student{
    private int age;
    Student(int age){
        // parametrized cont=structer
        this.age = age;

    }

    public int getAge() {
        return age;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student(14);
        int age = s1.getAge();
        System.out.println(age);
    }
}
