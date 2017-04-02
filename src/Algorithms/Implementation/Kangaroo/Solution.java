package Algorithms.Implementation.Kangaroo;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("src/Algorithms/Implementation/Kangaroo/input.txt"));
            double x1 = in.nextInt();
            double v1 = in.nextInt();
            double x2 = in.nextInt();
            double v2 = in.nextInt();

            double check = (x1 - x2)/(v2 - v1);
            if (check < 0) System.out.println("NO");
            else{
                String caster = String.valueOf(check);
                String[] checker = caster.split("");
                long finalCheck = Long.parseLong(checker[checker.length - 1]);
                if (finalCheck == 0) System.out.println("YES");
                else System.out.println("NO");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
