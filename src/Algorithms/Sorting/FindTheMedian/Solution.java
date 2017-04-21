package Algorithms.Sorting.FindTheMedian;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    private static int[] result;
    private static int midIdx;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        midIdx = result.length / 2;
        quickSort();
        System.out.println(result[midIdx]);
    }

    private static void quickSort() {
        performSort(0, result.length - 1);
    }

    private static void performSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = result[right];
            int partition = partition(left, right, pivot);
            if (midIdx >= left && midIdx <= partition - 1) {
                performSort(left, partition - 1);
            } else if (midIdx >= partition + 1 && midIdx <= right) {
                performSort(partition + 1, right);
            }
        }
    }

    private static int partition(int left, int right, int pivot) {
        int leftIdx = left - 1;
        int rightIdx = right;

        while (true) {
            while (result[++leftIdx] < pivot) {
            }
            while (rightIdx > 0 && result[--rightIdx] > pivot) {
            }
            if (leftIdx >= rightIdx) {
                break;
            } else {
                swap(leftIdx, rightIdx);
            }
        }
        swap(leftIdx, right);
        return leftIdx;
    }

    private static void swap(int left, int right) {
        int temp = result[left];
        result[left] = result[right];
        result[right] = temp;
    }
}
