package Leetcode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Leetcode_1047_Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String S = "abbaca";
        System.out.println(removeDuplicates(S));
    }

    private static String removeDuplicates(String S) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty() || S.charAt(i) != stack.peekLast()){
                stack.offer(S.charAt(i));
                continue;
            }
            while((!stack.isEmpty()) && (S.charAt(i) == stack.peekLast()))
                stack.removeLast();
        }
        StringBuilder res = new StringBuilder();
        Iterator<Character> it = stack.iterator();
        while(it.hasNext())
            res.append(it.next());
        return res.toString();

    }

}
