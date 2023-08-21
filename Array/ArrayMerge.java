package Array;
public class ArrayMerge {
    public static void main(String[] args) {
        // merge two sorted arrays
        int ar1[] = {2, 3, 5, 8, 9};
        int ar2[] = {1, 4, 6, 7};
        int length = ar1.length + ar2.length;
        int ar3[] = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < ar1.length && j < ar2.length) { // Change here: Use '<' instead of '<='
            if (ar1[i] < ar2[j]) {
                ar3[k] = ar1[i];
                i++;
            } else {
                ar3[k] = ar2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of ar1, if any
        while (i < ar1.length) {
            ar3[k] = ar1[i];
            i++;
            k++;
        }

        // Copy the remaining elements of ar2, if any
        while (j < ar2.length) {
            ar3[k] = ar2[j];
            j++;
            k++;
        }

        // Print the merged array
        for (int x : ar3) {
            System.out.print(x + " ");
        }

    }
}
