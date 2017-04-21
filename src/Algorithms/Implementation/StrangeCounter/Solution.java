package Algorithms.Implementation.StrangeCounter;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong(), n = 2;
        while (3 * (n - 1) < t) n = 2 * n;
        System.out.println((3 * (n - 1) - t + 1));
    }
}
