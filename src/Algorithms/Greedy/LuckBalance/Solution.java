package Algorithms.Greedy.LuckBalance;

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
        int q = in.nextInt();
        int q2 = in.nextInt();
        int[] c = new int[q];
        int num2 =10000000;
        int importantcount = 0;
        int[] o2 = new int[q];

        int totalluck = 0;
        int total = 0;
        for(int x = 0; x<q; x++){
            c[x] = in.nextInt();
            o2[x] = in.nextInt();
        }

        for (int e : o2){
            if(e == 1){
                importantcount++;
            }
        }
        int[] o = new int[importantcount];
        int l = 0;
        int inc = 0;
        for(int d : o2){
            if(d==1){
                o[l] = c[inc];
                l++;
            }
            inc++;

        }
        for(int s : c){
            total+=s;
        }
        for(int w = (importantcount-q2); w>0; w--){
            int place =0;
            int place2 = 0;
            for(int num : o) {
                if ((num < num2)&&(num>0)){
                    num2 = num;
                    place2 = place;
                }
                place++;
            }
            total-=(num2*2);
            o[place2]=0;
            place = 0;
            place2 = 0;
            num2 = 10000000;
        }
        System.out.println(total);
    }
}
