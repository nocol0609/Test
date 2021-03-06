package link.doublelink;

/**
 * 自定义双向链表
 * 
 * @author Nocol 下午2:45:01
 */
public class DoubleLinkList {

	/**
	 * 头节点
	 */
	private Node first;

	/**
	 * 尾节点
	 */
	private Node last;

	public DoubleLinkList() {

		first = null;
		last = null;
	}

	/**
	 * 在头节点插入
	 */
	public void addFirst(long value) {
		// 创建要插入的节点
		Node node = new Node(value);

		// 判断头节点是否为空
		if (first == null) {
			last = node;
		} else {
			first.previous = node;
		}

		node.next = first;
		first = node;
	}

	/**
	 * 在尾节点插入
	 */
	public void addLast(long value) {
		Node node = new Node(value);
		if (first == null) {
			first = node;
		} else {
			last.next = node;
			node.previous = last;
		}
		last = node;
	}

	/**
	 * 删除头节点
	 */
	public Node removeFirst() {
		// 获取头节点
		Node tmp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = tmp.next;
		return tmp;
	}

	/**
	 * 删除尾节点
	 */
	public Node removeLast() {
		// 获取尾节点
		Node tmp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}

		last = tmp.previous;
		return tmp;
	}

	/**
	 * 显示方法
	 */
	public void dispaly() {
		// 获取当前节点
		Node current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * 查找方法
	 */
	public Node get(long value) {
		Node current = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * 删除方法
	 */
	public Node remove(long value) {
		Node current = first;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}

		if (current == first) {
			first = first.next;
		} else {
			current.previous.next = current.next;
		}

		return current;
	}
}
