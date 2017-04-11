package Algorithms.Strings.SeperateTheNumbers;

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

    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("src/Algorithms/Strings/SeperateTheNumbers/input.txt"));
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            checkIfBeautiful(s);
        }
    }

    static void checkIfBeautiful(String str) {
        int i = 1;
        while (i <= str.length()/2) {
            String s = str.substring(0, i);
            if (s.charAt(0) == '0') break;

            long num = Long.parseLong(s);
            if (checkNextString(str, i, s, num)) {
                System.out.println("YES " + num);
                return;
            }
            i++;
        }
        System.out.println("NO");
    }

    static boolean checkNextString(String str, int index, String nextString, long target) {
        long num = Long.parseLong(nextString);
        if (num != target)
            return false;
        if (index == str.length()) return true;

        int nextIndex = index + (int)Math.log10(num+1) + 1;
        if (nextIndex > str.length())
            return false;

        String s = str.substring(index, nextIndex);
        return checkNextString(str, nextIndex, s, target+1);
    }
}