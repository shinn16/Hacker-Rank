package Algorithms.Strings.FunnyString;

import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/10/17
 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            String s1=sc.next();
            String s2=new StringBuilder(s1).reverse().toString();int j=0,k=0;
            for(k=1,j=1;j<s1.length() && k<s2.length();j++,k++){

                if( Math.abs((int)s1.charAt(j)-(int)s1.charAt(j-1))== Math.abs((int)s2.charAt(k)-(int)s2.charAt(k-1))){
                    flag=true;
                }
                else{
                    flag=false;
                    System.out.println("Not Funny");
                    break;
                }
            }
            if(flag==true){
                System.out.println("Funny");
            }
        }
    }
}
