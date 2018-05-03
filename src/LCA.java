import java.util.ArrayList;

/**
 * Find the lowest common ancestor of two item in a binary tree
 *
 * Assumptions:
 * - each value in the tree is unique (there're no two nodes with he same value)
 * - each node has at most two children, left and right
 * - you do not have a level attribute in each of your node (ex. 1st layer, 2nd layer, and so on)
 * - each node has pointers to left and right children, but there's no back link (a child node does not point back to it's parent node)
 */
class LCA {

    /**
     * Find the lowest common ancestor of two item in a binary tree
     * @param root root of the binary tree
     * @param j first value
     * @param k second value
     * @return TreeNode of the lowest common ancestor
     */
    static TreeNode lca(TreeNode root, int j, int k) {

        //if there is no root return null
        if (root == null) return null;

        //first find the j ancestor, if null return null without looking for k
        ArrayList<TreeNode> jAncestor = find(j, root, new ArrayList<>());
        if (jAncestor == null) {
            return null;
        }

        //second find the k ancestor, if null return null, don't need to compare with j ancestors
        ArrayList<TreeNode> kAncestor = find(k, root, new ArrayList<>());
        if (kAncestor == null) {
            return null;
        }

        //see which one is the smallest and see if the other contains the same ancestor
        //starting from the end to the begin to get the first common ancestor
        //implemented the equals() on the TreeNode
        if (jAncestor.size() <= kAncestor.size()) {
            for (int i = jAncestor.size() - 1; i >= 0; i--) {
                if (kAncestor.contains(jAncestor.get(i))) {
                    return jAncestor.get(i);
                }
            }
        } else {
            for (int i = kAncestor.size() - 1; i >= 0; i--) {
                if (jAncestor.contains(kAncestor.get(i))) {
                    return kAncestor.get(i);
                }
            }
        }

        return null;
    }

    /**
     * Find the value in the root and return the ancestor list counting with himself
     * If can't find the value return null
     * @param value to look in root
     * @param root binary tree
     * @param ancestor list of past ancestors
     * @return ArrayList<TreeNode> of ancestors of the value counting with himself
     */
    private static ArrayList<TreeNode> find(int value, TreeNode root, ArrayList<TreeNode> ancestor) {
        if (root == null) {
            return null;
        }

        ancestor.add(root);
        if (root.value == value) {
            return ancestor;
        }

        ArrayList<TreeNode> aux = find(value, root.left, new ArrayList<>(ancestor));
        if (aux != null) {
            return aux;
        }

        return find(value, root.right, new ArrayList<>(ancestor));
    }
}