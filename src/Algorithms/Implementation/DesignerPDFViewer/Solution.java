package Algorithms.Implementation.DesignerPDFViewer;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max=0;
        int length=word.length();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int i=0;
        for(char ch='a';ch<='z';ch++)
        {
            map.put(ch,h[i]);
            i++;
        }
        for(int j=0;j<length;j++)
        {
            int val=map.get(word.charAt(j));
            if(val>max)
                max=val;
        }
        System.out.println(max*length);
    }
}
