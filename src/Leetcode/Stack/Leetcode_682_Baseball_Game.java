package Leetcode.Stack;

import java.util.*;
import java.util.stream.*;

public class Leetcode_682_Baseball_Game {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str : ops){
            if(str != "C" && str != "D" && str != "+"){
                Integer score = Integer.valueOf(str);
                stack.add(score);
            }else if(str == "D"){
                if(!stack.isEmpty())
                    stack.add(2 * stack.peekLast());
            }else if(str == "C"){
                if(!stack.isEmpty())
                    stack.removeLast();
            }else if(str == "+"){
                Iterator it = stack.descendingIterator();
                int last_two_scores = 0;
                int i = 0;
                while(it.hasNext() && i++ < 2){
                    last_two_scores += (int)it.next();
                }
                stack.add(last_two_scores);
            }
        }
        int sum = 0;
        for(int num : stack)
            sum += num;
        return sum;
    }
}
/** 1. switch; 2. linkedlist(use get to access)
 * LinkedList<Integer> stack = new LinkedList<>();
 *         for (String op : ops){
 *             switch (op){
 *                 case "C":
 *                     stack.pollLast();
 *                     break;
 *                 case "D":
 *                     stack.addLast(stack.peekLast()*2);
 *                     break;
 *                 case "+":
 *                     stack.addLast(stack.peekLast() + stack.get(stack.size()-2));
 *                     break;
 *                 default:
 *                     stack.addLast(Integer.valueOf(op));
 *             }
 *         }
 *         int ans = 0;
 *         for (int i : stack)
 *             ans += i;
 *         return ans;
 */
