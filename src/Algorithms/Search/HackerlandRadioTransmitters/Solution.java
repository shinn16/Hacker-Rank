package Algorithms.Search.HackerlandRadioTransmitters;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class for Solution
 *
 * @author Brandon Duke
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        } int c=0;
        Arrays.sort(x);
        int i=0;
        while(i<=n){
            int j,z;
            for( j=i+1;j<n;j++){
                if(x[j]>(x[i]+k)) {
                    break;            }
            }
            for( z=j;z<n;z++){
                if(x[z]>x[j-1]+k){
                    break;
                }
            }
            i=z;
            c++;
        }
        System.out.println(c-1);
    }
}
