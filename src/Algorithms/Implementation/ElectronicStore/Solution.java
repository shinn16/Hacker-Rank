package Algorithms.Implementation.ElectronicStore;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/1/17
 */
public class Solution {
    public static void main(String[] args){
        int money;
        int[] keyboards;
        int[] usbs;
        int valueSpent = -1;
        boolean exit = false;


        try{
            Scanner scanner = new Scanner(System.in);

            //get money and array sizes
            money = scanner.nextInt();
            keyboards = new int[scanner.nextInt()];
            usbs = new int[scanner.nextInt()];

            // getting keyboard prices
            for (int i = 0; i < keyboards.length; i ++){
                keyboards[i] = scanner.nextInt();
            }

            //getting usb prices
            for (int i = 0; i <usbs.length; i ++){
                usbs[i] = scanner.nextInt();
            }

            // sort so we can know immediately if we can afford anything
            Arrays.sort(keyboards);
            Arrays.sort(usbs);



            // check to see if we can even purchase anything
            if (usbs[0] + keyboards[0] <= money){
                for (int keyboard: keyboards){// if so, do all the combinations until we spend all of the money
                    for (int usb: usbs){
                        if (usb + keyboard == money) { // if we find the exact amount, we are done.
                            valueSpent = money;
                            exit = true;
                            break;
                        }

                        // must be greater than the highest value and less than the money we have.
                        if (usb + keyboard > valueSpent && usb + keyboard < money){
                            valueSpent = usb + keyboard;
                        }
                    }
                    if (exit) break; // we found the exact value, we are done.
                }
            }
            System.out.println(valueSpent); // print the result





        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
