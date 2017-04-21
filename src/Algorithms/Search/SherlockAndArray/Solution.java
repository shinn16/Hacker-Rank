package Algorithms.Search.SherlockAndArray;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int sum = 0, s = 0;
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
                sum += a[a_i];
            }
            boolean isFound = false;
            for (int j = 0; j < n; j++) {
                sum -= a[j];
                if (s == sum) {
                    System.out.println("YES");
                    isFound = true;
                    break;
                }
                s += a[j];
            }
            if (!isFound)
                System.out.println("NO");
        }
    }
}
