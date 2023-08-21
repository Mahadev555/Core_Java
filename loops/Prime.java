package loops;

public class Prime {
    public static void main(String[] args) {
        int a = 2;
        while (a <= 100) {
            int count = 0;
            int i = 1;
            while (i <= a) {
                if (a % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 2) {
                System.out.println(a);
            }
            a++;


        }
    }}
