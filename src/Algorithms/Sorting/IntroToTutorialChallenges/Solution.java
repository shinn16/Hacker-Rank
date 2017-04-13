package Algorithms.Sorting.IntroToTutorialChallenges;

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
    public static void main (String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("src/Algorithms/Sorting/IntroToTutorialChallenges/input.txt"));
        int value = scanner.nextInt();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int counter = 0;
        while (scanner.hasNext()){
            numbers[counter] = scanner.nextInt();
            counter++;
        }
        int i = 0;
        for (; i < numbers.length; i++){
            if (numbers[i] == value){
                break;
            }
        }

        System.out.println(i);

    }
}
