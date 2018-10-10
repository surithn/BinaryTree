/**
 * 
 */
package binary;

/**
 * @author kxhb130
 *
 */
public class ConvertSortedArrayToBst {

	// find the mid and make it as root
	// find left
	// find right using recursive call
	// return final node
	static Node convertArrayToBst(int[] arr, int min, int max) {
		if (max < min)
			return null;
		int mid = min + (max - min) / 2;
		Node root = new Node(arr[mid]);
		root.left = convertArrayToBst(arr, min, mid - 1);
		root.right = convertArrayToBst(arr, mid + 1, max);
		return root;
	}

	static void verticalOrderPrint(Node node) {
		if (node.left != null)
			verticalOrderPrint(node.left);
		System.out.print(node.data);
		if (node.right != null)
			verticalOrderPrint(node.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		verticalOrderPrint(convertArrayToBst(arr, 0, arr.length - 1));
	}

}
