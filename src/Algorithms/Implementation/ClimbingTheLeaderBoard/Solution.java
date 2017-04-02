package Algorithms.Implementation.ClimbingTheLeaderBoard;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        int[] scores = new int[n];
        int[] positions = new int[n];
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in .nextInt();
            if (scores_i == 0) {
                positions[0] = 1;
            } else {
                if (scores[scores_i] == scores[scores_i - 1]) {
                    positions[scores_i] = positions[scores_i - 1];
                } else {
                    positions[scores_i] = positions[scores_i - 1] + 1;
                }
            }
        }


        int m = in .nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[m - alice_i - 1] = in .nextInt();
        }

        // Now this is where the fun begins
        int i = 0;
        int[] alice_position = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            for (; i < n; i++) {
                if (alice[alice_i] >= scores[i]) {
                    alice_position[alice_i] = positions[i];
                    break;
                }
            }
            if (scores[n - 1] > alice[alice_i]) {
                alice_position[alice_i] = positions[n - 1] + 1;
            }
        }

        for (int alice_i = m - 1; alice_i >= 0; alice_i--) {
            System.out.println(alice_position[alice_i]);
        }

    }
}