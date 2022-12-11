package tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 力扣94，二叉树的中序遍历
 */
public class InorderTraversal {

    public static List<Integer> inorderTraversalWithFor(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        while (root != null || !stack.isEmpty()) {
            getLeft(root, stack);

            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }

    private static void getLeft(TreeNode root, Deque<TreeNode> stack) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /**
     * 递归中序遍历二叉树
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        accessTree(root, result);

        return result;
    }

    private static void accessTree(TreeNode root, List<Integer> result) {
        if (null == root) {
            return;
        }

        accessTree(root.left, result);
        result.add(root.val);
        accessTree(root.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);

        root.left = new TreeNode(0);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(3);

        List<Integer> list = inorderTraversal(root);
        System.out.println(list);
    }
}
