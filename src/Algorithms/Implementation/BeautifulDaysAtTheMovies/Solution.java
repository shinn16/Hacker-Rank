package Algorithms.Implementation.BeautifulDaysAtTheMovies;

import java.util.Scanner;

/**
 * Solution Class
 *
 * @author Patrick Shinn
 * @version 4/14/17
 */
public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int beautifulDays = 0;
            for(int day = i; day <= j; day++){
                int x = day;
                int reverse_x = 0;
                while(x!=0){
                    reverse_x = reverse_x * 10 + x % 10;
                    x /= 10;
                }
                if(Math.abs(day-reverse_x)%k==0)
                    beautifulDays++;
            }

            System.out.print(beautifulDays);
        }
}
