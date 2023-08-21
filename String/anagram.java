package String;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
        String s1 ="ra ma";
        String s2 = "ma hra";

        //remove white space
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        //concert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char ar1[] = s1.toCharArray();
        char ar2[] = s2.toCharArray();

        //sort
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1,ar2)){
            System.out.println("it is an anagram");
        }
        else {
            System.out.println("its not an anagram");
        }




    }
}
