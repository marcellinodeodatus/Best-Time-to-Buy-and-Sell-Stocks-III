// LeetCode - Top Interview 150
// 123. Best Time to Buy and Sell Stock III
// Topic: Multidimensional Dynamic Programming

import java.util.*;

public class stock {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
                return 0;
        }
    
        int firstBuy = Integer.MIN_VALUE;  // Keep track of the lowest price for the first buy
        int firstSell = 0;  // Max profit after the first sell
        int secondBuy = Integer.MIN_VALUE;  // Keep track of the lowest price for the second buy
        int secondSell = 0;  // Max profit after the second sell
    
        // Iterate over each price
        for (int price : prices) {
            firstBuy = Math.max(firstBuy, -price);  // Maximize the first buy (minimize the price)
            firstSell = Math.max(firstSell, firstBuy + price);  // Maximize the first sell profit
            secondBuy = Math.max(secondBuy, firstSell - price);  // Maximize the second buy
            secondSell = Math.max(secondSell, secondBuy + price);  // Maximize the second sell profit
        }
    
        return secondSell;  // Maximum profit after two transactions
    }

    public static void main (String[] args){

        int[] prices1 = new int[]{ 3,3,5,0,0,3,1,4 };
        int[] prices2 = new int[]{1,2,3,4,5};
        int[] prices3 = new int[]{7,6,4,3,1};

        System.out.println("Prices 1: " + Arrays.toString(prices1));
        int solution = maxProfit(prices1);
        System.out.println("Output: " +solution);
        
        System.out.println("Prices 2: " + Arrays.toString(prices2));
        solution = maxProfit(prices2);
        System.out.println("Output: " +solution);

        System.out.println("Prices 3: " + Arrays.toString(prices3));
        solution = maxProfit(prices3);
        System.out.println("Output: " +solution);

    } // end driver


}// end class stock
