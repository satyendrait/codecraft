package me.ss.ds.tree;

public class BinaryTreePreOrderTraversal {
  public void preOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.val + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    BinaryTreePreOrderTraversal binaryTreePreOrderTraversal = new BinaryTreePreOrderTraversal();
    binaryTreePreOrderTraversal.preOrder(root);
  }
}
