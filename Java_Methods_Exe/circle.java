import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number for redius :");
        int a = sc.nextInt();
        System.out.println("the circumference of a circle is :"+ circlec(a));
    }

    public static double circlec(int a){
        double pi = 22d/7d;
        double cirum = 2*(pi)*a;
        return cirum;
    }
}
