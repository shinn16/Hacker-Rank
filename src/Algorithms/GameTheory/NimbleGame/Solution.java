package Algorithms.GameTheory.NimbleGame;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int r = 0;
            for (int i = 0; i < n; i++)
                if (scanner.nextInt() % 2 == 1)
                    r ^= i;
            if (r == 0)
                System.out.println("Second");
            else
                System.out.println("First");
        }
    }
}
