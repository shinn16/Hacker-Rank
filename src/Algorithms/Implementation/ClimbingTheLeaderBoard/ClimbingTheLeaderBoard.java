package Algorithms.Implementation.ClimbingTheLeaderBoard;

import java.io.File;
import java.util.*;

/**
 * ClimbingTheLeaderBoard class
 *
 * @author Patrick Shinn
 * @version 4/1/17
 */
public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        ArrayList<Integer> orderedScores = new ArrayList<>();
        boolean scored = false;
        HashSet<Integer> sort = new HashSet<>();
        try{
            Scanner in = new Scanner(System.in);

            // put each scores in a heap to sort it.
            int n = in.nextInt();
            for(int scores_i=0; scores_i < n; scores_i++){
                int value = in.nextInt();
                if (sort.add(value)){ // remove any duplicates before inserting
                    orderedScores.add(-1 * value);
                }
            }
            // sort
            Collections.sort(orderedScores);
            // building alice's scores
            int m = in.nextInt();
            int[] alice = new int[m];
            for(int alice_i=0; alice_i < m; alice_i++){
                alice[alice_i] = in.nextInt();
            }

            // comparing alice to other scores and printing rank
            int rank = 1; // descending counter
            for (int score : alice){ // for all of her scores
                for (int otherScore: orderedScores){ // compare them to all the other score
                    if (score >= -1 * otherScore){ // if she has one that is equal, give her the rank
                        System.out.println(rank);
                        scored = true; // let the next loop know she received a score.
                        break;
                    }
                    rank ++; // otherwise, increment the rank.
                }
                if (!scored) System.out.println(rank); // if she came in last, print her score.
                scored = false; // reset scored
                rank = 1; // reset counter
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
