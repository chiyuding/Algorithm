package Leetcode.Array;

import java.util.ArrayDeque;

public class Leetcode_122_Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int profit = 0;
        for(int price : prices){
            if(!stack.isEmpty() && price < stack.getLast()){
                if(stack.size() > 1)
                    profit += stack.getLast() - stack.getFirst();
                stack.clear();
            }
            stack.add(price);
        }
        if(stack.size() > 1)
            profit += stack.getLast() - stack.getFirst();
        return   profit;
    }
}
