/**
 * Is this a Binary Search Tree?
 * Write a funciona that takes a binary tree and returns true if it's a a bst, and false if not.
 */
class BinarySearchTree {

    static boolean isBST(TreeNode node) {
        return isBST(node, null, null);
    }

    /**
     * Check if node.value is not lower than lowerLimit and is not greater than upperLimit
     * As long as lowerLimit and upperLimit are not null
     * @param node current node
     * @param lowerLimit lower limit
     * @param upperLimit upper limit
     * @return true if it is a binary search tree
     */
    private static boolean isBST(TreeNode node, Integer lowerLimit, Integer upperLimit) {
        if (lowerLimit != null && lowerLimit > node.value) {
            return false;
        }

        if (upperLimit != null && upperLimit < node.value) {
            return false;
        }

        boolean leftBst = true, rightBst = true;
        if (node.left != null) {
            leftBst = isBST(node.left, lowerLimit, node.value);
        }
        if (leftBst && node.right != null) {
            rightBst = isBST(node.right, node.value, upperLimit);
        }

        return leftBst && rightBst;
    }

}
