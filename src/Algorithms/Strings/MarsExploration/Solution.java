package Algorithms.Strings.MarsExploration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/9/17
 */
public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Algorithms/Strings/MarsExploration/input.txt"));
        String S = in.next();

        int counter = 0;
        for (int i = 0; i < S.length(); i+=3){
            if (S.charAt(i) != 'S') counter++;
            if (S.charAt(i + 1) != 'O') counter++;
            if (S.charAt(i + 2) != 'S') counter++;
        }

        System.out.println(counter);
    }
}

