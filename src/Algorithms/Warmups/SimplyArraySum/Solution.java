package Algorithms.Warmups.SimplyArraySum;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class Solution {
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int sum = 0;
        for(String string: array){
            sum += Integer.parseInt(string);
        }
        System.out.println(sum);
    }

}

