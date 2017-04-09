package Algorithms.Warmups.AVeryBigSum;

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
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        while(scanner.hasNextInt()) sum += scanner.nextInt();
        System.out.println(sum);
    }
}
