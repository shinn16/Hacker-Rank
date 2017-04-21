package Algorithms.GameTheory.IntroductionToNimGame;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static String nim(int[] s){
        int nim_sum = 0;
        for(int i=0; i<s.length; i++){
            nim_sum = nim_sum ^ s[i];
        }
        if(nim_sum == 0) return "Second";
        return "First";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        String[] result = new String[g];
        for(int i=0; i<g; i++){
            int n = sc.nextInt();
            int[] s = new int[n];
            for(int j=0; j<n; j++){
                s[j] = sc.nextInt();
            }
            result[i] = nim(s);
        }
        for(String re:result){
            System.out.println(re);
        }
    }
}
