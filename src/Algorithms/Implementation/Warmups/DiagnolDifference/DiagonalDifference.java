package Algorithms.Implementation.Warmups.DiagnolDifference;

import java.util.Scanner;

/**
 * DiagonalDifference class
 *
 * @author Patrick Shinn
 * @version 4/2/17
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        int counter = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            int[] nums = new int[split.length];
            for(int i = 0; i < split.length; i ++) nums[i] = Integer.parseInt(split[i]);
            matrix[counter] = nums;
            counter ++;
        }

        int sum1 = 0;
        int sum2 = 0;


        counter = 0;
        for(int i = 0; i < n; i ++){
            sum1 += matrix[i][counter];
            counter ++;
        }
        counter = n - 1;
        for(int i = 0; i < n; i ++){
            sum2 += matrix[i][counter];
            counter --;
        }

        int difference = Math.abs(sum1 - sum2);
        System.out.println(difference);

    }
}
