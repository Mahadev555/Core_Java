package String;

public class Strings {

    public static void main(String[] args) {
        //im mutable
        String name = "Atharv";
        String name2 = new String("omkar ");
        String rahul = new String("omkar");
        String rajesh = "Atharv";

        name.concat("mahadev");

        System.out.println(name2 == rahul);
        System.out.println(name == rajesh);






        // mutable
        StringBuilder name1 = new StringBuilder("mohan");
        name1.append("mahadev");

        System.out.println("mutable....");

        System.out.println(name1);


    }

}
