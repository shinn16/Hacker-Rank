package Algorithms.BitManipulation.LonleyInteger;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    private static int lonelyInteger(int[] a) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum ^= a[i];
        }
        //System.out.println(lonelyInteger(a));
        System.out.println(sum);
    }
}
