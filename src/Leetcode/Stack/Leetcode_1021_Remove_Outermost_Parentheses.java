package Leetcode.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Leetcode_1021_Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String S = "(())()((()))";
        System.out.println(removeOuterParentheses(S));
    }

    private static String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        int diff = 0;
        int prev = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '(')
                diff++;
            else
                diff--;
            if(diff == 0){
                res.append(S.substring(prev + 1, i));
                prev = i + 1;
            }
        }
        return res.toString();
    }

}
