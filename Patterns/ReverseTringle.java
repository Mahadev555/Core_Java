package Patterns;

public class ReverseTringle {
    public static void main(String[] args) {

        int space = 0;
        int star = 7;

        for(int i = 0; i<=7;i++){
            for(int j = 0;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=0;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            space++;
            star--;
        }
    }
}


//        ********
//        *******
//        ******
//        *****
//        ****
//        ***
//        **
//        *
