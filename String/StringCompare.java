package String;

import java.sql.SQLOutput;

public class StringCompare {

// == oterator to compaarae reference

    // equals() ------ compare value

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello") ;
        String s3 = "Hello";

        System.out.println(s1==s2);  // false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        System.out.println(s1.equalsIgnoreCase(s3));  //true
    }
}
