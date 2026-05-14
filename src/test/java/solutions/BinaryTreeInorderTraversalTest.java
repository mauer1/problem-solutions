package solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    public void testExample1() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.right = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right.left = new BinaryTreeInorderTraversal.TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testEmptyTree() {
        assertEquals(Arrays.asList(), solution.inorderTraversal(null));
    }

    @Test
    public void testSingleNode() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testLeftSkewedTree() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        root.left = new BinaryTreeInorderTraversal.TreeNode(2);
        root.left.left = new BinaryTreeInorderTraversal.TreeNode(3);
        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, solution.inorderTraversal(root));
    }
}
