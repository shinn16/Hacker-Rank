package Algorithms.Implementation.PickingNumbers;

import java.util.Scanner;

/**
 * PickingNumbers Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int c1=0,c2=0,c3=0;
            for(int j=i+1;j<n;j++){
                if(a[j]-a[i]==0){
                    c1++;
                }
                else if(a[j]-a[i]==1){
                    c2++;
                }
                else if(a[j]-a[i]==-1){
                    c3++;
                }
            }
            if(Math.max((c1+c2),(c1+c3))>max)
                max=Math.max((c1+c2),(c1+c3));
        }
        System.out.println(max+1);
    }
}
