
package Random;

/* DAILY CODE DAY #13 
 * @GeekforGeeks: Count the leaves of given a binary tree
 * */
class Node {
	
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}
public class CountLeavesOfTree {
	
	Node root;

	private static int getLeafCount(Node root) {
		if (root == null) {
			return 0;
		}
		if(root.left == null && root.right == null)	{
			return 1;
		}
		
		else {
			return getLeafCount(root.left) + getLeafCount(root.right);
		}
	}

	public static void main(String[] args) {
		CountLeavesOfTree tree = new CountLeavesOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println(getLeafCount(tree.root));
	}
}



