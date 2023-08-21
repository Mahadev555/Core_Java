package Java_Methods_Exe;

public class tejas_pat {
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



        // uncommon ele in two arrays

//        int arr[] = {1,2,3,4};
//        int arr2[] = {3,4,5,6};
//        // determines length of firstArray
//        int a1 = arr.length;
//
//        // determines length of secondArray
//        int b1 = arr2.length;
//        int c1 = a1 + b1;
//
//        // create the resultant array
//        int[] c = new int[c1];
//
//        // using the pre-defined function arraycopy
//        System.arraycopy(arr, 0, c, 0, a1);
//        System.arraycopy(arr2, 0, c, a1, b1);
//
//        for(int i = c.length-1;i>=0;i--){
//            for(int j = 0; j< arr2.length;j++){
//                if(c[i]==arr2[j]){
//                     int k = i ; // k index is going to be deleted
//                    for(i=k;i<c.length-1;i++);{
//                        c[i]=c[i+1];
//                    }
//                }
//
//            }
//
//        }
//
//        System.out.println("uncommon elements are : ");
//        for(int i = 0 ; i<c.length-1;i++){
//            System.out.print(c[i]+" ") ;
//        }

    }
}

