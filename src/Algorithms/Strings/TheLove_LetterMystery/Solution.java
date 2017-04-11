package Algorithms.Strings.TheLove_LetterMystery;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            String str = scan.next();
            System.out.println(minimumOperations(str));
        }
        scan.close();
    }

    private static int minimumOperations(String str) {
        int count = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            count += Math.abs(str.charAt(i) - str.charAt(str.length() - 1 - i));
        }
        return count;
    }
}
