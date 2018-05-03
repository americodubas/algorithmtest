import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LCATest {

    private TreeNode head1;
    private TreeNode head2;

    @Before
    public void init() {
        HashMap<Integer, int[]> mapping1 = new HashMap<>();
        int[] childrenA = {1, 2};
        int[] childrenB = {3, 4};
        int[] childrenC = {5, 6};
        mapping1.put(0, childrenA);
        mapping1.put(1, childrenB);
        mapping1.put(2, childrenC);

        head1 = createTree(mapping1, 0);
        // This tree is:
        // head1 = 0
        //        / \
        //       1   2
        //      /\   /\
        //     3  4 5  6


        HashMap<Integer, int[]> mapping2 = new HashMap<>();
        int[] childrenD = {1, 4};
        int[] childrenE = {3, 8};
        int[] childrenF = {9, 2};
        int[] childrenG = {6, 7};
        mapping2.put(5, childrenD);
        mapping2.put(1, childrenE);
        mapping2.put(4, childrenF);
        mapping2.put(3, childrenG);

        head2 = createTree(mapping2, 5);
        // This tree is:
        //  head2 = 5
        //        /   \
        //       1     4
        //      /\    / \
        //     3  8  9  2
        //    /\
        //   6  7
    }

    @Test
    public void forOneAndFiveShouldReturnZero() {
        assertEquals(0, LCA.lca(head1, 1, 5).value);
    }

    @Test
    public void forThreeAndOneShouldReturnOne() {
        assertEquals(1, LCA.lca(head1, 3, 1).value);
    }

    @Test
    public void forOneAndFourShouldReturnOne() {
        assertEquals(1, LCA.lca(head1, 1, 4).value);
    }

    @Test
    public void forZeroAndFiveShouldReturnZero() {
        assertEquals(0, LCA.lca(head1, 0, 5).value);
    }

    @Test
    public void forFourAndSevenShouldReturnFive() {
        assertEquals(5, LCA.lca(head2, 4, 7).value);
    }

    @Test
    public void forThreeAndThreeShouldReturnThree() {
        assertEquals(3, LCA.lca(head2, 3, 3).value);
    }

    @Test
    public void forEightAndSevenShouldReturnOne() {
        assertEquals(1, LCA.lca(head2, 8, 7).value);
    }

    @Test
    public void forThreeAndZeroShouldReturnNull() {
        assertNull(LCA.lca(head2, 3, 0));
    }

    // A function for creating a tree.
    // Input:
    // - mapping: a node-to-node mapping that shows how the tree should be constructed
    // - headValue: the value that will be used for the head ndoe
    // Output:
    // - The head node of the resulting tree
    private static TreeNode createTree(HashMap<Integer, int[]> mapping, int headValue) {
        TreeNode head = new TreeNode(headValue, null, null);
        HashMap<Integer, TreeNode> nodes = new HashMap<>();
        nodes.put(headValue, head);
        for(Integer key : mapping.keySet()) {
            int[] value = mapping.get(key);
            TreeNode leftChild = new TreeNode(value[0], null, null);
            TreeNode rightChild = new TreeNode(value[1], null, null);
            nodes.put(value[0], leftChild);
            nodes.put(value[1], rightChild);
        }
        for(Integer key : mapping.keySet()) {
            int[] value = mapping.get(key);
            nodes.get(key).left = nodes.get(value[0]);
            nodes.get(key).right = nodes.get(value[1]);
        }
        return head;
    }
}