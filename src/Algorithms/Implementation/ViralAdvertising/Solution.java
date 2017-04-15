package Algorithms.Implementation.ViralAdvertising;

import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class Solution {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num = keyboard.nextInt();
        int people = 5;
        int sum = 0;

        for(int i = 0; i < num; i++){
            people = (int) Math.floor(people/2);
            sum += people;
            people *= 3;
        }


        System.out.println(sum);

    }
}
