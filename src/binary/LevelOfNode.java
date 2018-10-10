/**
 * 
 */
package binary;

/**
 * Find level of node in tree.
 * 
 * google what is level of tree
 * 
 * root-- level 1 Leaves immediate to root - level 2 & so on
 * 
 * @author kxhb130
 *
 */
public class LevelOfNode {

	static int level(Node root, int key, int level) {
		if (root == null)
			return -1;
		if (root.data == key)
			return level;
		int left = level(root.left, key, level+1);
		if (left != -1)
			return left;
		return level(root.right, key, level+1);
	}

	static int levelBST(Node root, int key, int level) {
		if (root == null)
			return -1;
		if (root.data == key)
			return level;
		if (root.data > key)
			return levelBST(root.left, key, level+1);
		return levelBST(root.right, key, level+1);
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
		root.left.right.left.left = new Node(9);

		// level of 8 is 1
		System.out.println(level(root, 8, 0));
		System.out.println(levelBST(root, 8, 0));

		// level of 12 is 2
		System.out.println(level(root, 12, 0));
		System.out.println(levelBST(root, 12, 0));

		// level of 10 is 3
		System.out.println(level(root, 10, 0));
		System.out.println(levelBST(root, 10, 0));

		// level of 9 is 4
		System.out.println(level(root, 9, 0));
		System.out.println(levelBST(root, 9, 0));
	}

}
