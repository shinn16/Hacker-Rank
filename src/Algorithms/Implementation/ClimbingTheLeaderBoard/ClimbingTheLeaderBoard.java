package Algorithms.Implementation.ClimbingTheLeaderBoard;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClimbingTheLeaderBoard class
 *
 * @author Patrick Shinn
 * @version 4/1/17
 */
public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("src/Algorithms/Implementation/ClimbingTheLeaderBoard/input.txt"));
            int n = in.nextInt();
            int[] scores = new int[n];
            for(int scores_i=0; scores_i < n; scores_i++){
                scores[scores_i] = in.nextInt();
            }
            int m = in.nextInt();
            int[] alice = new int[m];
            for(int alice_i=0; alice_i < m; alice_i++){
                alice[alice_i] = in.nextInt();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        // your code goes here
    }
}
