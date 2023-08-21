package loops;

public class Que {
    public static void main(String[] args) {
        for(int i = 1; i <=4;i++){

            for(int j = 1; j <=i;j++){
                int n = (i+j)-1;
                if((i+j)%2 == 0  ){
                    System.out.print(n*n+" ");
                }
                if((i+j)%2 != 0  ){
                    System.out.print( n*n*n +" ");
                }

            }
            System.out.println();
        }

    }
}
