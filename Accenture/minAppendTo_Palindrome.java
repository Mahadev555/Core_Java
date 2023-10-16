package Accenture;

public class minAppendTo_Palindrome {

    static boolean isPan(String a){
        StringBuffer sb = new StringBuffer(a);
        String new1 = sb.reverse().toString();

        return a.equals(new1);

    }
    public static void main(String[] args) {

        String s = "abcdcba";
        int count = 0;


        while(!isPan(s)){

            s = s.substring(0,s.length()-1);
            count++;
        }

        System.out.println(count);

    }
}
