/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.util.Arrays;

/**
 *
 * @author wangh
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {2, 1, 5, 4, 3, 0, 18, 15, 6, 7};
        array = quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] quickSort(int[] arr, int left, int right) {
        int i = left;
        int compare = left;
        int j = right;
        while (true) {
            if (i > j) {
                return arr;
            } else if (arr[i] > arr[compare] && arr[j] < arr[compare]) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } else if (i == j) {
                int temp = arr[i];
                arr[i] = arr[compare];
                arr[compare] = temp;
                break;
            }
            if (arr[j] >= arr[compare]) {
                j -= 1;
            } else if (arr[i] <= arr[compare]) {
                i += 1;
            }

        }
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
        return arr;
    }
}
