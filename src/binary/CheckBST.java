/**
 * 
 */
package binary;

/**
 * @author kxhb130
 *
 */
public class CheckBST {

	static boolean isBst(Node root, int min, int max) {
		if (root == null)
			return true;
		
		if (root.data < min || root.data > max)
			return false;
		return isBst(root.left, min, root.data-1) 
					&& isBst(root.right, root.data+1, max);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(5);
		node.right  = new Node(20);
		node.left.right = new Node(9);
		node.left.left	= new Node(4);
		System.out.println(isBst(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

}
