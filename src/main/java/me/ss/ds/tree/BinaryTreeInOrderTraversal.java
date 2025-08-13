package me.ss.ds.tree;

public class BinaryTreeInOrderTraversal {
  public void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.val + " ");
    inOrder(node.right);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    BinaryTreeInOrderTraversal binaryTreeInOrderTraversal = new BinaryTreeInOrderTraversal();
    binaryTreeInOrderTraversal.inOrder(root);
  }
}
