package String;

public class StringReverse {
    public static void main(String[] args) {


        // reversing


        //Case 1

        String s1 = "mahadev";
        String s2 = "";



        for(int i=s1.length()-1;i>=0;i--){
            s2 = s2 + s1.charAt(i);
        }

        System.out.println(s1);
        System.out.println(s2);


        //case 2

        String s3 = "ath ra v";
        String s4 = "";
        String str[] = s3.split(" "); // split string into array by given range ie " "


        for(int i = str.length-1;i>=0;i--){
            s4 = s4+str[i]+" ";

        }
        System.out.println(s3.charAt(3));
        System.out.println(s3);
        System.out.println(s4);


        //case 3
        // array to str

        for(String element:str){
            System.out.println(element);
        }

    }
}
