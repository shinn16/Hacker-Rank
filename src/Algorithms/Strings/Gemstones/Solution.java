package Algorithms.Strings.Gemstones;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //int Array letterCount[] to store the count of letters occuring in each String.
        int[] letterCount = new int[26];
        Arrays.fill(letterCount,0);

        for (int i=0;i<N;i++) {
            char[] charArr = scan.next().toCharArray();
            Arrays.sort(charArr);
            int c0 = (int) charArr[0];

            //increment letterCount value at index. Get index by subtracting 97 from ascii value of letter.
            letterCount[c0-97] = letterCount[c0-97] + 1;
            for (int j=1;j<charArr.length;j++) {
                if (charArr[j]!=charArr[j-1]) {
                    int c = (int) charArr[j];
                    letterCount[c-97] = letterCount[c-97] + 1;
                }
            }
        }

        //if any of the letterCount[] value is N then that letter has occurred in each of the Strings. Increment counter.
        int result = 0;
        for (int i=0;i<26;i++) {
            if (letterCount[i]==N) result++;
        }
        System.out.println(result);

    }
}
