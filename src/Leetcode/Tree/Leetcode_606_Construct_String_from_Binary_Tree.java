package Leetcode.Tree;

public class Leetcode_606_Construct_String_from_Binary_Tree {
    public static String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        res.append(t.val);
        if(t.left != null) {
            res.append("(").append(tree2str(t.left)).append(")");
        }
        if(t.right != null) {
            if(t.left == null) {
                res.append("()");
            }
            res.append("(").append(tree2str(t.right)).append(")");
        }
        return res.toString();
    }
}
