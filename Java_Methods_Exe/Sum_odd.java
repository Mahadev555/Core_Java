import java.util.Scanner;

public class Sum_odd {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(i%2 == 0){

            }
            else{
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
