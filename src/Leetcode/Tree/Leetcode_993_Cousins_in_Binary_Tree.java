package Leetcode.Tree;

import java.util.HashMap;

public class Leetcode_993_Cousins_in_Binary_Tree {
    public static boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer, Object[]> map = new HashMap<>();
        map = dfs(root, null, 0, map);
        if(map.containsKey(x) && map.containsKey(y)) {
            Object[] value1 = map.get(x);
            Object[] value2 = map.get(y);
            return value1[0] == value2[0] && value1[1] != value2[1];
        }
        return false;
    }

    private static HashMap<Integer, Object[]> dfs(TreeNode node, TreeNode par, int depth, HashMap<Integer, Object[]> map) {
        if(node == null) {
            return map;
        }
        Object[] temp = new Object[2];
        if(par != null) {
            temp[1]  = par;
        }
        temp[0] = depth;
        map.put(node.val, temp);
        HashMap<Integer, Object[]> left = dfs(node.left, node, depth + 1, map);
        return dfs(node.right, node, depth + 1, left);
    }
}
