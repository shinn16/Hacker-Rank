package Algorithms.Warmups.BirthdayCakeCandles;

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
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int m = 0;
        for (int i : height){
            if (i > m) m = i;
        }

        int count = 0;
        for (int i : height){
            if (m == i) count++;
        }

        System.out.println(count);
    }
}
