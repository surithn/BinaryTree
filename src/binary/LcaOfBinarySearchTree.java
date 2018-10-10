/**
 * 
 */
package binary;

/**
 * LCA of Binary Search Tree
 * 
 * Diff from binary tree is its sorted.
 * 
 * 
 * @author kxhb130
 *
 */
public class LcaOfBinarySearchTree {

	static Node lca(Node root, int n1, int n2) {
		if (root == null)
			return root;
		if (root.data == n1 || root.data == n2)
			return root;
		
		if (root.data > n1 && root.data > n2)
			return lca(root.left, n1, n2);
		if (root.data < n1 && root.data < n2)
			return lca(root.right, n1, n2);
		return root;
	}

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);

		// LCA of 10 and 14 is 12
		System.out.println(lca(root, 10, 14));

		// LCA of 14 and 8 is 8
		System.out.println(lca(root, 14, 8));

		// LCA of 10 and 22 is 20
		System.out.println(lca(root, 10, 22));
	}

}
