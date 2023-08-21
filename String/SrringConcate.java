package String;

public class SrringConcate {
    public static void main(String[] args) {

        String s1 = "hello";
        s1.concat("hr");         // will not concate but create reference object of hellohr
        System.out.println(s1);

        String s2 = new String("Hello");
        s2 = s2.concat("ooo");   // will concate & reference change
        System.out.println(s2);

        String s3 = s2.concat("hello");
        System.out.println(s3);


        // plus operator

        s3 = s3 + "java";
        System.out.println(s3);

        s3 = s3 + "java"+99;
        System.out.println(s3);
    }
}
