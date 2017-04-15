package Algorithms.Implementation.SaveThePrisioner;

import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        while(n-->0) {
            long N = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            long x = (m +s-1-1)%N+1;
            System.out.println(x);
        }
    }
}
