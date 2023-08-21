import java.util.Scanner;

public class java_Methods {

//    public static void myName(String name) {
//        System.out.println(name);
//        return;
//    }

    // function for adding two no.
    public static int addNo(int a , int b){
        int c = a + b;
        return c ;

    }

    //fun for product of two no.
    public static int mulNo(int a , int b){
        int product = a*b;
        return product;

    }


    //factorial
    public static void fact(int n){

        if(n<0){
            System.out.println("invalid no !");
            return;
        }
        int facto = 1;
        for(int i = n; i>=1 ; i--){
            facto = facto*i;

        }
        System.out.println(facto);
    }

    //main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = addNo(a,b);

        System.out.println("sum of these no. is : "+ c);
        System.out.println("Product of no. : " + mulNo(a,b));

        int n = sc.nextInt();
        fact(n);
        }

}
