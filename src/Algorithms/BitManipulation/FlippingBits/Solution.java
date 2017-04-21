package Algorithms.BitManipulation.FlippingBits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            while (t >= 1 && t-- <= 100) {
                Integer n = Integer.parseUnsignedInt(br.readLine());
                n ^= -1;
                System.out.println(Integer.toUnsignedString(n));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
