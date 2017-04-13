package Algorithms.Sorting.RunningTimeOfAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/12/17
 */
public class Solution {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/Algorithms/Sorting/RunningTimeOfAlgorithms/input.txt"));
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int counter = 0;
        while (scanner.hasNext()){
            numbers[counter] = scanner.nextInt();
            counter++;
        }

        int shifts = 0;

        for (int i = 1; i < numbers.length; i++){
            for (int j = i; j > 0; j--){
                if (numbers[j] < numbers[j - 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    shifts++;
                }
            }

        }

        System.out.println(shifts);
    }
}
