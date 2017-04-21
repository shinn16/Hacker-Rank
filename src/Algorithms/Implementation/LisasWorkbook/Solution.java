package Algorithms.Implementation.LisasWorkbook;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int k = sn.nextInt();
        int [] m = new int[n];
        int j=2;int x=0; int y=0;
        int count=0 ;

        for(int i=0 ; i<n ; i++){
            m[i] = sn.nextInt();
        }

        for(int i=0 ; i<n ; i++){
            //System.out.println("x:"+x);
            //System.out.print("|||j:"+j);
            x = x+((j-2)/k)+1;
            //System.out.println("check x:"+x);
            // if((j != 0)&&(j%k == 0))
            //   x--;
            for(j=1 ; j<=m[i] ; j++){
                y = x+(j-1)/k;
                if(j==y)
                    count++;
            }
        }
        System.out.println(count);


    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
