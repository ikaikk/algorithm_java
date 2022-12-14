package tree;

/**
 * 力扣101，对称二叉树
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }

        return deepCheck(root.left, root.right);
    }

    private boolean deepCheck(TreeNode left, TreeNode right) {
        if (null == left && null == right) {
            return true;
        }

        if (null == left || null == right) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
    }
}
