package Algorithms.Implementation.ClimbingTheLeaderBoard;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ClimbingTheLeaderBoard class
 *
 * @author Patrick Shinn
 * @version 4/1/17
 */
public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        LinkedHashSet<Integer> orderedScores = new LinkedHashSet<>();
        PriorityQueue<Integer> sort = new PriorityQueue<>();
        boolean scored = false;
        try{
            Scanner in = new Scanner(new File("src/Algorithms/Implementation/ClimbingTheLeaderBoard/input.txt"));

            // put each scores in a heap to sort it.
            int n = in.nextInt();
            for(int scores_i=0; scores_i < n; scores_i++){
                sort.add(-1 * in.nextInt()); // convert to max heap
            }
            // remove duplicates
            while (!sort.isEmpty()){
                orderedScores.add(-1 * sort.remove()); // make the number positive again.
            }

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
                    if (score >= otherScore){ // if she has one that is equal, give her the rank
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
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
