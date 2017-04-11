package Algorithms.Strings.Pangrams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/9/17
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/Algorithms/Strings/Pangrams/input.txt"));
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        ArrayList<Character> total = new ArrayList<>();

        for (char c : chars) if (!total.contains(Character.toLowerCase(c)) && c != ' ') total.add(Character.toLowerCase(c));

        if (total.size() == 26) System.out.println("pangram");
        else System.out.println("not pangram");
    }
}
