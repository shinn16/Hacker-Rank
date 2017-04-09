package Algorithms.Strings.CamelCase;

import java.io.File;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/8/17
 */
public class Solution {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/Algorithms/Strings/CamelCase/input.txt"));
            String s = scanner.nextLine();
            char[] c = s.toCharArray();

            int counter = 1;
            for (Character c1 : c) if (Character.isUpperCase(c1)) counter++;

            System.out.println(counter);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
