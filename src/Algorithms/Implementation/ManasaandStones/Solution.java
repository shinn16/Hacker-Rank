package Algorithms.Implementation.ManasaandStones;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int t = stdin.nextInt();
        for (int t_i = 0; t_i < t; t_i++) {
            int n = stdin.nextInt();
            int a = stdin.nextInt();
            int b = stdin.nextInt();

            TreeSet<Integer> finalStones = new TreeSet<Integer>();

            for (int i = 0; i < n; i++) {
                int sum = (i * a) + ((n - 1 - i) * b);
                finalStones.add(sum);
            }

            for (Integer e : finalStones) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

