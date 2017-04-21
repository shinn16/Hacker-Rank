package Algorithms.Implementation.EqualizetheArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] k = new int[n];
        for(int i = 0; i < n; i ++){
            k[i] = scanner.nextInt();
        }
        System.out.println(minDeletions(k));
    }

    public static int minDeletions(int[] a) {
        int max = 1;
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i : a)
            if (!nums.containsKey(i))
                nums.put(i, 1);
            else {
                nums.put(i, nums.get(i) + 1);
                if (max < nums.get(i))
                    max = nums.get(i);
            }
        return a.length - max;
    }
}
