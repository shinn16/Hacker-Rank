package Algorithms.Greedy.JimAndTheOrders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        ArrayList<Order> ls = new ArrayList<Order>();
        for (int id = 1; id <= n; id++) {
            int orderAt = in.nextInt();
            int orderTime = in.nextInt();
            ls.add(new Order(orderAt, orderTime, id));
        }
        Collections.sort(ls, new totalComparator());
        for (int i = 0; i < ls.size(); i++) {
            if (i == ls.size() - 1) {
                System.out.print(ls.get(i).id);
            } else {
                System.out.print(ls.get(i).id + " ");
            }

        }

    }

    static class Order {
        int orderAt;
        int orderTime;
        int id;
        int total;// total time for each order

        public Order(int orderAt, int orderTime, int id) {
            this.orderAt = orderAt;
            this.orderTime = orderTime;
            this.id = id;
            total = orderAt + orderTime;
        }
    }

    // comparator to compare the orders by total time for each order
    static class totalComparator implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            return o1.total - o2.total;
        }
    }
}
