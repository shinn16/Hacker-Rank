package Algorithms.Sorting.QuickSortInPlace;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/12/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i ++) {
            ar[i] = scan.nextInt();
        }

        quickSort(ar, 0, ar.length - 1);
    }

    public static void quickSort(int[] ar, int start, int pivot) {
        if(start >= pivot) return;
        int p = ar[pivot];
        int swap = start;
        for(int i = start; i < pivot; i ++) {
            if(ar[i] < p) {
                int temp = ar[i];
                ar[i] = ar[swap];
                ar[swap] = temp;
                swap ++;
            }
        }
        ar[pivot] = ar[swap];
        ar[swap] = p;

        for(int v: ar) {
            System.out.print(v + " ");
        }
        System.out.println();
        quickSort(ar, start, swap - 1);
        quickSort(ar, swap + 1, pivot);
    }
}
