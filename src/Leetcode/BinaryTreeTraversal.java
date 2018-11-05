
package Leetcode;

import java.util.ArrayList;
import java.util.List;


/* DAILY CODE DAY #19
 * @Leetcode: Given a binary tree, return the inorder traversal of its nodes' values. */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
	}
}

public class BinaryTreeTraversal {
	static TreeNode root;
	
	public static List<Integer> inorderTraversal(TreeNode root) {
        List < Integer > nodeList = new ArrayList < > ();
        traverse(root, nodeList);
        return nodeList;
    }

	
    private static void traverse(TreeNode root, List<Integer> nodeList) {
		if (root != null) {
			if (root.left != null) {
				traverse(root.left, nodeList);
			}
			nodeList.add(root.val);
			if (root.right != null) {
				traverse(root.right, nodeList);
			}
		}
	}

	public static void main(String[] args) {
		BinaryTreeTraversal.root = new TreeNode(1);
		BinaryTreeTraversal.root.left = new TreeNode(2);
		BinaryTreeTraversal.root.right = new TreeNode(3);
		BinaryTreeTraversal.root.left.left = new TreeNode(4);
		BinaryTreeTraversal.root.left.right = new TreeNode(5);
		BinaryTreeTraversal.root.right.left = new TreeNode(6);
		System.out.println(inorderTraversal(root));
	}
}








