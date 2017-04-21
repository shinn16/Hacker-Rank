package Algorithms.Implementation.OrganizingContainersofBalls;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    int x = in.nextInt();
                    a[i] += x;
                    b[j] += x;
                }
            }
            String pts = "Possible";
            for(int i=0;i<n;i++)
            {
                int j=0;
                for(j=i;j<n;j++)
                {
                    if(a[i] == b[j])
                    {
                        int temp = b[j];
                        b[j] = b[i];
                        b[i] = temp;
                        break;
                    }
                }
                if(j==n)
                {
                    pts = "Impossible";
                    break;
                }
            }
            System.out.println(pts);
        }
    }
}
