public class loop_adv_patterns {
    public static void main(String[] args) {
        int n = 4;
        //upper part
        for(int i = 1; i<=n; i++){
            //for star
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //for spaces
            for(int j = 1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower part
        for(int i = n; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *
//
        int a =5;
        int b = 4;
        for(int i = 1; i<=a; i++){
            int c=a-i;
             for(int j = 1;j<=c;j++){
                 System.out.print(" ");
             }
             for(int j = 1;j<=a;j++){
                 System.out.print("*");
             }

            System.out.println();
        }

//        *****
//       *****
//      *****
//     *****
//    *****

        int d= 5;
        int e = 1;
        for(int i = 1; i<=d; i++){
            for(int j = 1; j<=d-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(e);
                for(int k = 1; k<=1;k++){
                    System.out.print(" ");
                }
            }
            e++;

            System.out.println();
        }
//         1
//        2 2
//       3 3 3
//      4 4 4 4
//     5 5 5 5 5






    }
}
