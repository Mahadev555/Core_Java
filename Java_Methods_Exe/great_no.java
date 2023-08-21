import java.util.Scanner;

public class great_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        great(a, b);
    }

    public static void great(int a, int b) {
        if (a < b) {
            System.out.println("Greater no is : " + b);
        } if (a == b){
            System.out.println("Both numbers are equal !");
        }
        else {
            System.out.println("Greater number is : "+a);
        }

    }
}




