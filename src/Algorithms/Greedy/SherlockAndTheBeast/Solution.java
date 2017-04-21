package Algorithms.Greedy.SherlockAndTheBeast;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    private static final String FIVES = "555";
    private static final String THREES = "33333";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(largestDecentNum(in.nextInt()));
        }
    }

    public static String largestDecentNum(int n) {
        StringBuilder sb = new StringBuilder();
        if (n < 3 || n == 4 || n == 7) {
            sb.append("-1");
        } else if (n % 3 == 0) {
            for (int i = 0; i < n/3; i++) {
                sb.append(FIVES);
            }
        } else if (n % 3 == 1) {
            for (int i = 0; i < (n-10)/3; i++) {
                sb.append(FIVES);
            }
            sb.append(THREES);
            sb.append(THREES);
        } else if (n % 3 == 2) {
            for (int i = 0; i < (n-5)/3; i++) {
                sb.append(FIVES);
            }
            sb.append(THREES);
        }
        return sb.toString();
    }
}
