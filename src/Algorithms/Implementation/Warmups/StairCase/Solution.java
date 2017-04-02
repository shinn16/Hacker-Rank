package Algorithms.Implementation.Warmups.StairCase;

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
        int size = Integer.parseInt(scanner.nextLine());
        int counter = size - 2;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                if(j > counter) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
            counter --;
        }
    }
}
