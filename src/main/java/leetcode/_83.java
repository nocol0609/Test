package leetcode;

import leetcode.common.ListNodeUtils;
import leetcode.temp.ListNode;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 15:30
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例?1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例?2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 */
public class _83 {

    public static void main(String[] args) {
//        ListNode node=new ListNode(1);
//        node.next=new ListNode(1);
//        node.next.next=new ListNode(2);
//        node.next.next.next=new ListNode(3);
//        node.next.next.next.next=new ListNode(3);
        ListNode node=null;
        ListNode listNode = deleteDuplicates(node);
        ListNodeUtils.printListNode(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        //1->1->2->3->3
        //1->2->3
        while (current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return head;
    }

}
