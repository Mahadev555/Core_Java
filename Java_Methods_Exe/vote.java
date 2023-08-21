package Java_Methods_Exe;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int a = sc.nextInt();
        isAble(a);
    }

    public static void isAble(int a){
        if(a<=18){
            System.out.println("Not eligible to vote !");
        }
        else {
            System.out.println("Eligible to vote !!!!!!");
        }
    }
}
