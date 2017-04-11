package Algorithms.Implementation.MigratoryBirds;

import java.io.File;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/10/17
 */
public class Solution {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("/home/neo/Github/personal/Hacker-Rank/src/Algorithms/Implementation/MigratoryBirds/input.txt"));
            int n = in.nextInt();
            int[] types = new int[n];
            for (int types_i = 0; types_i < n; types_i++) {
                types[types_i] = in.nextInt();
            }
            // your code goes here
            int[] birdCounts = new int[n];
            for (int bird : types) birdCounts[bird]++;

            int max = 0;
            int type = 0;
            for (int i = 0; i < birdCounts.length; i ++){
                if (birdCounts[i] > max){
                    max = birdCounts[i];
                    type = i;
                }
            }
            System.out.print(type);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
