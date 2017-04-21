package Algorithms.Implementation.JumpingOnTheClouds;

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
        int n = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c[i+2]==0) i++;
        }
        System.out.println(count);
    }
}
