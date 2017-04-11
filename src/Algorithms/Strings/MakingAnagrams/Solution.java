package Algorithms.Strings.MakingAnagrams;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System. in);
        String s1=sc.next();
        String c2=sc.next();
        StringBuilder s2=new StringBuilder(c2);
        int count=0;
        for(int j=0;j<s1.length();j++){
            for(int p=0;p<s2.length();p++){
                if(s1.charAt(j)==s2.charAt(p)){
                    count=count+2;
                    s2=s2.deleteCharAt(p);
                    break;
                }
            }

        }

        System.out.println(s1.length()+c2.length()-count);

    }
}
