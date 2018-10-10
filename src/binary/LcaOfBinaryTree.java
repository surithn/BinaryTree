/**
 * 
 */
package binary;

/**
 * Find LCA - Lowest Common Ancestor of given nodes
 * 
 * lca - find parent who's in common and smallest.
 * 
 * @author kxhb130
 *
 */
public class LcaOfBinaryTree {

	static Node lca(Node root, int n1, int n2) {
		if (root == null)
			return root;
		if (root.data == n1 || root.data == n2)
			return root;
		Node left_lca = lca(root.left, n1, n2);
		Node right_lca = lca(root.right, n1, n2);
		if (left_lca != null && right_lca != null)
			return root;
		return (left_lca != null) ? left_lca : right_lca;
	}

	/**
	 * @param args
	 */
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
