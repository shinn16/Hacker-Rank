package Algorithms.Strings.CeaserCipher;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/9/17
 */
public class Solution {
    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new File("src/Algorithms/Strings/CeaserCipher/input.txt"));
            int len = in.nextInt();
            String s = in.next();
            int shift = in.nextInt();

            ArrayList<Character> chars = new ArrayList<>();
            for (char c : s.toCharArray()) {
                chars.add(c);
            }

            s = "";
            for (char c : chars){
                if (((int)c >= 97 && (int)c <= 122)){
                    c = (char) ((c + shift - (int)'a') % 26 + (int)'a');
                    s += c;
                }
                else if (((int)c >= 65 && (int)c <= 90)){
                    c = (char) ((c + shift - (int)'A') % 26 + (int)'A');
                    s += c;
                }
                else s+=c;
            }

            System.out.println(s);

        } catch (Exception e) {}
    }
}
