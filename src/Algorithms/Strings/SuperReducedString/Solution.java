package Algorithms.Strings.SuperReducedString;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Brandon Duke
 * @version 4/8/17
 */
public class Solution {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/Algorithms/Strings/SuperReducedString/input.txt"));
            String s = scanner.nextLine();
            char[] c = s.toCharArray();
            String tempS = "";
            boolean needRechecked = false;
            while (!needRechecked) {
                needRechecked = true;
                int i = 0;
                try {
                    for (; i <= c.length; i++) {
                        if (c[i] == c[i + 1]) {
                            c[i] = ' ';
                            c[i + 1] = ' ';
                            needRechecked = false;
                        } else {
                            if (c[i] != ' ') tempS += c[i];
                        }
                    }
                }catch (Exception e){
                    try {
                        if (c[i] != ' ') tempS += c[i];
                        s = tempS;
                        tempS = "";
                        c = s.toCharArray();
                    }
                    catch (Exception e1) {s = null;}
                }


            }

            if (s != null) System.out.println(s);
            else System.out.println("Empty String");
        }catch (Exception e){e.printStackTrace();}

    }
}
