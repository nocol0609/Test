package tree;

/**
 * 二叉树的节点
 * 
 * @author Nocol 下午5:02:50
 */
public class Node {
	/**
	 * 数据项
	 */
	public long data;

	/**
	 * 左子节点
	 */
	public  Node leftChild;

	/**
	 * 右节点
	 */
	public  Node rigthChild;

	public Node(long data) {
		this.data = data;
	}
}
