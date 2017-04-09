package Algorithms.Implementation.BreakingTheRecords;

import java.io.File;
import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/9/17
 */
public class Solution {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(new File("/home/neo/Github/personal/Hacker-Rank/src/Algorithms/Implementation/BreakingTheRecords/input.txt"));
            int size = scanner.nextInt();
            int[] scores = new int[size];
            // populate the array
            for (int i = 0; i < size; i ++){
                scores[i] = scanner.nextInt();
            }

            // record holders
            int best = scores[0];
            int worst = scores[0];
            int bestBroken = 0;
            int worstBroken = 0;

            // time to check for score breaks
            for (int i = 1; i < size; i ++){
                if (scores[i] > best){
                    bestBroken ++;
                    best = scores[i];
                }
                else if (scores[i] < worst){
                    worstBroken ++;
                    worst = scores[i];
                }
            }

            System.out.println(bestBroken + " " + worstBroken);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
