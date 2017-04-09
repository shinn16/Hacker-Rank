package Algorithms.Strings.HackerRankInAString;

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
        Scanner in = new Scanner(new File("src/Algorithms/Strings/HackerRankInAString/input.txt"));
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            if (contains(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean contains(String s){
        char[] hack = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        char[] string = s.toCharArray();
        int counter = 0;

        for (int i = 0; i < string.length; i++){
            if (hack[counter] == string[i]){
                counter++;
                if (counter == 10) break;
            }
        }

        return counter == 10;
    }
}