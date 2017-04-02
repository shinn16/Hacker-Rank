package Algorithms.Implementation.AppleAndOrgange;

import java.io.File;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args){
        try {
            Scanner in = new Scanner(System.in);
            int houseStart = in.nextInt();
            int houseEnd = in.nextInt();
            int appleTree = in.nextInt();
            int orangeTree = in.nextInt();
            int numApples = in.nextInt();
            int numOranges = in.nextInt();

            // counters
            int appleHits = 0;
            int orangeHits = 0;

            // array builders
            int[] apples = new int[numApples];
            for (int apple_i = 0; apple_i < numApples; apple_i++) {
                apples[apple_i] = in.nextInt();
            }
            int[] oranges = new int[numOranges];
            for (int orange_i = 0; orange_i < numOranges; orange_i++) {
                oranges[orange_i] = in.nextInt();
            }

            // finding apple hits
            for (int apple : apples){
                if (apple + appleTree >= houseStart && apple + appleTree <= houseEnd) appleHits++;
            }
            // finding orange hits
            for (int orange : oranges) {
                if (orange + orangeTree >= houseStart && orange + orangeTree <= houseEnd) orangeHits++;
            }
            // printing
            System.out.println(appleHits);
            System.out.println(orangeHits);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
