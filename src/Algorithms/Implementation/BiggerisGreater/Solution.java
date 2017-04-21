package Algorithms.Implementation.BiggerisGreater;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //char fch = ' ';
        //char sch = ' ';
        //char sv = ' ';
        //String sub = " ";
        //int tind = 0, tempj = 0;
        //Boolean isfch = false;
        for(int i =0; i<t; i++){
            String str = sc.next();
            char fch = ' ';
            char sch = ' ';
            char sv = ' ';
            String sub = " ";
            int tind = 0, tempj = 0;
            Boolean isfch = false;
            if(str.length() < 2){
                System.out.println("no answer");

            }

            else if(str.length() > 1){
                for(int in = str.length()-1; in > 0;in--){
                    if(str.charAt(in)>str.charAt(in-1)){
                        fch = str.charAt(in-1);
                        tind = in - 1;
                        sub = str.substring(in);
                        sv = sub.charAt(0);
                        isfch = true;
                        break;
                    }

                }
                if(isfch == false){
                    System.out.println("no answer");
                }
                else{
                    for(int j = 0; j<sub.length();j++){
                        sch = sub.charAt(j);

                        if(sch < sv && sch > fch){
                            sv = sub.charAt(j);
                            tempj = j;

                        }
                    }
                    sch = sv;
                    char[] tempchar = str.toCharArray();
                    char tempo = tempchar[tind];
                    tempchar[tind] = tempchar[tind + tempj + 1];
                    tempchar[tempj + tind + 1] = tempo;
                    String swstr = String.valueOf(tempchar);

                    String sub3 = swstr.substring(0,tind+1);
                    String sub2 = swstr.substring(tind+1);

                    char[] t2 = sub2.toCharArray();
                    Arrays.sort(t2);
                    String swstr2 = String.valueOf(t2);
                    sub3 = sub3.concat(swstr2);

                    System.out.println(sub3);


                }
            }

        }
    }
}
