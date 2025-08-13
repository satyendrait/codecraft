package me.ss.ds.tree;

public class ArrayToBinaryTree {

  TreeNode binaryToArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    return buildTree(nums, 0);
  }

  TreeNode buildTree(int[] nums, int idx) {
    if (idx >= nums.length || nums[idx] == 0) {
      return null;
    }
    TreeNode node = new TreeNode(nums[idx]);
    node.left = buildTree(nums, 2 * idx + 1);
    node.right = buildTree(nums, 2 * idx + 2);
    return node;
  }

  public static void main(String[] args) {
    ArrayToBinaryTree converter = new ArrayToBinaryTree();
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = converter.binaryToArray(nums);

    // You can add a traversal here to verify the tree
    BinaryTreeInOrderTraversal inOrderTraversal = new BinaryTreeInOrderTraversal();
    System.out.print("In-order traversal: ");
    inOrderTraversal.inOrder(root);
    System.out.println();

    BinaryTreePreOrderTraversal preOrderTraversal = new BinaryTreePreOrderTraversal();
    System.out.print("Pre-order traversal: ");
    preOrderTraversal.preOrder(root);
    System.out.println();

    BinaryTreePostOrderTraversal postOrderTraversal = new BinaryTreePostOrderTraversal();
    System.out.print("Post-order traversal: ");
    postOrderTraversal.binaryTreePostOrderTraversal(root);
    System.out.println();
  }
}
