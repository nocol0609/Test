package leetcode;

import leetcode.common.ListNodeUtils;
import leetcode.temp.ListNode;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 16:09
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 */
class _206 {

    public static void main(String[] args) {
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(3);
        firstNode.next.next.next=new ListNode(4);
        firstNode.next.next.next.next=new ListNode(5);
        ListNodeUtils.printListNode(firstNode);
        ListNode result = reverseList(firstNode);
        ListNodeUtils.printListNode(result);
    }

    public static ListNode reverseList(ListNode head) {
        //前指針
        ListNode preNode=null;
        ListNode current=head;
        //1->2->3->4->5->NULL
        //5->4->3->2->1->NULL
        while (current!=null){
            //获取当前节点的下一节点，用于存储下一次循环的头节点
            ListNode next=current.next;
            current.next=preNode;
            //前指針后移
            preNode=current;
            current=next;
        }
        return preNode;
    }

}
