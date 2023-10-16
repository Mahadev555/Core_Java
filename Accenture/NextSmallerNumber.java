package Accenture;

import java.util.Scanner;

public class NextSmallerNumber {
    public static void findMaximum(int[] arr, int length) {
        int maxElement = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(maxElement);
        System.out.println(maxIndex);
    }

    public static void main(String[] args) {
                int[] array = {23,45,82,71};
                int arrayLength = array.length;
                findMaximum(array, arrayLength);
            }
        }
