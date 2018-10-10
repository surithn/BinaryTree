/**
 * 
 */
package binary;

/**
 * @author kxhb130
 *
 */
public class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
	
	public String toString() {
		return "Node[ "+data+ " ]";
	}
}
