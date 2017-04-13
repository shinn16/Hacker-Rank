package Algorithms.Sorting.InsertionSortPart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/12/17
 */
public class Solution {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/Algorithms/Sorting/InsertionSortPart1/input.txt"));
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int counter = 0;
        while (scanner.hasNext()){
            numbers[counter] = scanner.nextInt();
            counter++;
        }

        int temp = numbers[numbers.length - 1];
        for (int i = numbers.length - 2; i >= 0; i--){
            if (numbers[i] > temp){
                numbers[i + 1] = numbers[i];
                for (int j : numbers) System.out.print(j + " ");
                System.out.println();
            }
            else {
                numbers[i + 1] = temp;
                for (int j : numbers) System.out.print(j + " ");
                break;
            }
            if(i == 0){
                numbers[0] = temp;
                for (int j : numbers) System.out.print(j + " ");
                break;
            }
        }
    }
}

