package tree;

/**
 * 力扣110，平衡二叉树
 */
public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return false;
        }

        return Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}
