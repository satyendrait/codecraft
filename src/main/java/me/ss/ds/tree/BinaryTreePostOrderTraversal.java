package me.ss.ds.tree;

public class BinaryTreePostOrderTraversal {
  public void binaryTreePostOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    binaryTreePostOrderTraversal(root.left);
    binaryTreePostOrderTraversal(root.right);
    System.out.print(root.val + " ");
  }
}
