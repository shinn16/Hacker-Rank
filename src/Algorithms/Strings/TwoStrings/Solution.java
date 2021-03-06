package Algorithms.Strings.TwoStrings;

import java.util.HashSet;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s1=sc.next();
            String s2=sc.next();
            int count=0;
            HashSet<Character> h1=new HashSet<Character>();
            HashSet<Character> h2=new HashSet<Character>();
            for(char c : s1.toCharArray()){
                h1.add(c);
            }
            for(char c : s2.toCharArray()){
                h2.add(c);
            }
            h1.retainAll(h2);
            if(h1.size()>1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}