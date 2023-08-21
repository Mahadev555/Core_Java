import java.util.Scanner;

public class loops_ques {
    public static void main(String[] args) {
       // sum of n numbers
        int i;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(i=1;i<=n;i++) {
            s =  s +i ;
        }
        System.out.println(s);


        //print table of number A
         int A = sc.nextInt();
         int table ;

         for(i = 1 ; i<11; i++){
             table = A*i;
             System.out.println(table);
         }

    }
}
