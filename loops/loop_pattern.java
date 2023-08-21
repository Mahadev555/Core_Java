public class loop_pattern {
    public static void main(String[] args) {
//        for (int j = 1; j <= 4; j++) {
//
//            for (int i = 1; i <= 5; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("---------------------------");
//
//        int m= 4;
//        int n = 5;
//        for(int i =  1 ; i<= m; i++){
//            for(int j = 1; j<=n;j++){
//                if( i == 1|| i ==m || j==1 || j ==n ){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//        System.out.println("---------------------------");
//
//
//        int a = 4;
//        for(int i = 1 ; i<=a;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("---------------------------");
//int a = 4;
//
//        for(int i = a ; i>=1;i--){
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i = 1;i<=5;i++){
//            for(int j = 1 ; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        for(int i = 5;i>=1;i--){
//            for(int j = 1 ; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int no = 1;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1 ; j<=i;j++){
//                System.out.print(no+" ");
//                no++;
//            }
//            System.out.println();
//        }

        for(int i = 1;i<=5;i++){
            for(int j =1 ; j<=i;j++){
                 if((i+j)%2 == 0){
                     System.out.print("1");
                 }
                 else {
                     System.out.print("0");
                 }
            }
            System.out.println();
        }

    }
}

