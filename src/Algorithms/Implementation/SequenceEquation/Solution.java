package Algorithms.Implementation.SequenceEquation;

import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class Solution {
    public static void main(String [] args) {
        /* Create function: p_inverse */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            p_inverse[px] = x;
        }
        scan.close();

        /* Calculate and print each y */
        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            System.out.println(y);
        }
    }
}
