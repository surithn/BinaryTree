/**
 * 
 */
package binary;

/**
 * Find distance between two nodes
 * 
 * distance is sum of edges between two nodes
 * 
 * two ways to find: 1. dist(root, n1) + dist(root, n2) - 2*(lca(n1,n2)); 2.
 * level(lca(n1,n2), n1, 0) + level(lca(n1,n2), n2, 0)
 * 
 * @author kxhb130
 *
 */
public class DistanceBetweenNodes {

	static int distance(Node tree, int n1, int n2) {
		Node lca = LcaOfBinaryTree.lca(tree, n1, n2);
		return LevelOfNode.level(lca, n1, 0) + LevelOfNode.level(lca, n2, 0);
	}

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		root.left.right.left.left = new Node(9);

		System.out.println("distance (4, 12) is 2  & output is: " + distance(root, 4, 12));
		System.out.println("distance (10, 22) is 4  & output is: " + distance(root, 10, 22));
		System.out.println("distance (4, 9) is 4  & output is: " + distance(root, 4, 9));
	}

}
