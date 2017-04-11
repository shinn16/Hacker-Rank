package Algorithms.Implementation.BirthdayChocolates;

import java.io.File;
import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/9/17
 */
public class Solution {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        int totalPieces = squares.length - m + 1;
        int finalNumber = 0;
        for (int i = 0; i < totalPieces; i ++){
            int range = i + m;
            int sum = 0;
            for (int j = i; j < range; j ++) sum ++;
            if (sum == d) finalNumber ++;
        }
        return finalNumber;
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("/home/neo/Github/personal/Hacker-Rank/src/Algorithms/Implementation/BirthdayChocolates/Solution.java"));
            int n = in.nextInt();
            int[] s = new int[n];
            for (int s_i = 0; s_i < n; s_i++) {
                s[s_i] = in.nextInt();
            }
            int d = in.nextInt();
            int m = in.nextInt();
            int result = getWays(s, d, m);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
