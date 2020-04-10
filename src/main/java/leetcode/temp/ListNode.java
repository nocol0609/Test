package leetcode.temp;

import link.singlelink.Node;

/**
 * @author ：liuxp
 * @date ：Created in 2020/1/3 11:40
 * @description ：
 */
public class ListNode {
    public int val;
    public ListNode next;

    /**
     * 头结点
     */
    public ListNode head;

    public ListNode() {
        head=null;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public void display() {
        // 获取当前节点
        ListNode current = head;
        while (current != null) {
            // 递归显示头节点
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 新增节点，尾部插入
     */
    public void addNode(long value){
        ListNode newNode=new ListNode((int)value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode temp=head;
        //遍历到尾结点
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
}