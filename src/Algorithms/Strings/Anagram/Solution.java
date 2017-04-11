package Algorithms.Strings.Anagram;

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
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            if(s[i].length()%2==1){
                System.out.println("-1");
            }
            else{
                String s1=s[i].substring(0,s[i].length()/2);
                String s2=s[i].substring(s[i].length()/2);
                int count=0;
                for(int j=0;j<s1.length();j++){
                    int k=s2.indexOf(s1.charAt(j));
                    if(k !=-1){
                        count=count+1;
                        s2=s2.substring(0,k)+s2.substring(k+1);
                    }
                }
                System.out.println(s1.length()-count);
            }
        }
    }
}
