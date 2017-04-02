package Algorithms.Implementation.CountingValleys;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/1/17
 */
public class Solution {
    public static void main(String[] args) {
        int length;
        int valleys = 0;
        int elevation = 0;
        boolean inValley = false;
        try{
            Scanner scanner = new Scanner(new File("/home/neo/Github/personal/Hacker-Rank/src/Algorithms/Implementation/CountingValleys/input.txt"));
            length = Integer.parseInt(scanner.nextLine()); // useless
            String[] path = scanner.nextLine().split("");
            System.out.println(Arrays.toString(path));
            for (String step : path){
                if (step.equals("U")) elevation ++;
                else elevation --;

                // check for valley
                if (elevation == 0) inValley = false;
                if (!inValley && elevation < 0){
                    inValley = true;
                    valleys ++;
                }
            }
            System.out.println(valleys);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

