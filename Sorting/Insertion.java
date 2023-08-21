package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 5, 1, 3};
        //           0  1  2  3   4  5
        //           j  i 
        for(int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;
        }


    }
}
