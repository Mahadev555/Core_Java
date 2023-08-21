package OOP_pw_Java.Encapsulation;

class Stu3{
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SetterGetter {

    public static void main(String[] args) {
        Stu3 st3 = new Stu3();
        st3.setAge(2);
        int age = st3.getAge();
        System.out.println(age);

        st3.setName("mahadev");
        String name = st3.getName();
        System.out.println(name);
    }

}
