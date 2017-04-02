package Algorithms.Implementation.Warmups.CompareTheTriplets;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int aliceScore = 0;
        int bobScore = 0;

        if(a0 < b0) bobScore ++;
        else if(a0 > b0) aliceScore ++;

        if(a1 < b1) bobScore ++;
        else if (a1 > b1) aliceScore ++;

        if(a2 < b2) bobScore ++;
        else if(a2 > b2) aliceScore ++;

        System.out.println(aliceScore + " " + bobScore);
    }
}
