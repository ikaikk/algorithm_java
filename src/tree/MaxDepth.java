package tree;

public class MaxDepth {
    public static int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(10);

        int depth = maxDepth(root);
        System.out.println(depth);
    }
}
