package Accenture;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        for(int i = n;n>0;n--){

            sum = sum+n;

        }
        int cards = sum*3;
        int count =  cards-m;
        System.out.println(count);
    }
}
