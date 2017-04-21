package Algorithms.BitManipulation.SumVsXOR;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String [] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();

        /* Calculate number of "x" values that will satisfy n+x = n^x */
        int zeroes = numZeroes(n);
        long result = 1L << zeroes; // same as (long) Math.pow(2, zeroes);
        System.out.println(result);
    }

    private static int numZeroes(long n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n >>= 1; // divides by 2
        }
        return count;
    }
}
