package tree;

/**
 * 二叉树
 * 
 * @author Nocol 下午5:05:34
 */
public class Tree {

	/**
	 * 根节点
	 */
	public Node root;

	/**
	 * 插入节点
	 */
	public void insert(long value) {

		// 封装插入的节点
		Node newNode = new Node(value);
		// 引用当前节点
		Node current = root;
		// 引用父节点
		Node parent;
		// 判断root是否为null，即第一次插入的时候
		if (root == null) {
			root = newNode;
			return;
		} else {
			while (true) {
				// 若root不为空，则让当前节点为父节点
				parent = current;
				// 如果新插入的节点比当前节点小，则往左走
				if (value < current.data) {
					// 获取当前节点的左孩子节点
					current = current.leftChild;
					if (current == null) {
						// 若当前节点的左孩子节点为null,则新插入的就为当前节点的左孩子节点
						parent.leftChild = newNode;
						return;
					}
				} else {
					// 获取当前节点的右孩子节点
					current = current.rigthChild;
					if (current == null) {
						// 若当前节点的右孩子节点为null,则新插入的就为当前节点的右孩子节点
						parent.rigthChild = newNode;
						return;
					}
				}
			}
		}

	}

	/**
	 * 查找节点
	 */
	public Node find(long value) {

		// 当前节点的引用,从根节点开始查找
		Node current = root;
		// 只要查找的节点不等于当前节点则继续查找
		while (current.data != value) {

			// 若当前节点大于要查找的节点，则往左边查找
			if (current.data > value) {
				current = current.leftChild;
			} else {
				// 若当前节点小于要查找的节点，则往右边查找
				current = current.rigthChild;
			}
			// 若查找不到则返回空
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	/**
	 * 删除节点
	 */
	public boolean delete(long value) {

		// 引用当前节点
		Node current = root;
		// 引用当前节点的父节点
		Node parent = root;

		// 是否为左节点
		boolean isLeftChild = true;

		// 先查找要删除的节点
		while (current.data != value) {
			// 将当前节点作为父节点
			parent = current;
			// 往左边找
			if (current.data >= value) {
				// 是左节点
				isLeftChild = true;
				if (current.leftChild != null) {
					parent = current;
					current = current.leftChild;
				}
			} else {
				// 是右孩子
				isLeftChild = false;
				if (current.rigthChild != null) {
					parent = current;
					current = current.rigthChild;
				}
			}
			// 若查找不到
			if (current == null) {
				return false;
			}
		}

		// 若删除的是叶子节点
		if (current.leftChild == null && current.rigthChild == null) {
			// 若要删除的节点为根节点
			if (current == root) {
				root = null;
				// 若要删除的节点为左孩子节点
			} else if (isLeftChild) {
				parent.leftChild = null;
				// 若要删除的节点为右孩子节点
			} else {
				parent.rigthChild = null;
			}
			// 如果被删除节点只有左孩子
		} else if (current.rigthChild == null) {
			// 若当前节点为根节点
			if (current == root) {
				root = current.leftChild;
				// 若要删除的节点为左孩子节点
			} else if (isLeftChild) {
				// 若要删除的节点为左孩子节点
				parent.leftChild = current.leftChild;
			} else {
				// 若要删除的节点为右孩子节点
				parent.rigthChild = current.leftChild;
			}
			// 如果被删除节点只有右节点
		} else if (current.leftChild == null) {
			if (current == root) {
				root = current.rigthChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rigthChild;
			} else {
				parent.rigthChild = current.rigthChild;
			}
			// 若备删除的节点有了两个子节点
		} else {
			// 获取中序后继节点  
			Node successor = getSuccessor(current);
			// 将后序节点与被删除的父节点进行连接，完成整个替换过程
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rigthChild = successor;
			}
			successor.leftChild = current.leftChild;
		}

		return true;
	}

	/**
	 * 获取中序后继节点
	 * 
	 * @param delNode
	 *            当前要删除的节点
	 * @return
	 */
	private Node getSuccessor(Node delNode) {

		// 当前开始遍历的节点
		Node current = delNode.rigthChild;
		// 要找的节点
		Node successor = current;
		// 要找的节点的父节点
		Node successorParent = null;

		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		if (successor != delNode.rigthChild) {

			// 将后继节点的子节点（只可能是右节点）替补到后继节点的位置
			successorParent.leftChild = successor.rigthChild;
			// 将被删除的右孩子连接到后继节点的右节点上
			successor.rigthChild = delNode.rigthChild;
			// 将被删除的左孩子连接到后继节点的右节点上（就是用后继节点替换调被删除的节点）
		}

		return successor;
	}

	/**
	 * 前序遍历(参数为根节点/子树根节点)
	 */
	public void frontOrder(Node localNode) {
		if (localNode != null) {
			// 访问根节点
			System.out.println(localNode.data);
			// 前序遍历左字树
			frontOrder(localNode.leftChild); // 左子树的根节点
			// 前序遍历右子树
			frontOrder(localNode.rigthChild); // 右子树的根节点
		}
	}

	/**
	 * 中序遍历
	 */
	public void inOrder(Node localNode) {
		if (localNode != null) {

			// 中序遍历左子树
			inOrder(localNode.leftChild);
			// 访问根节点
			System.out.println(localNode.data);
			// 中序遍历右字树
			inOrder(localNode.rigthChild);
		}
	}

	/**
	 * 后序遍历
	 */
	public void afterOrder(Node loacalNode) {
		if (loacalNode != null) {

			// 后序遍历左子树
			afterOrder(loacalNode.leftChild);
			// 后序遍历右字树
			afterOrder(loacalNode.rigthChild);

			// 访问根节点
			System.out.println(loacalNode.data);

		}
	}
}
