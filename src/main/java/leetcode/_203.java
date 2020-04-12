package leetcode;

import leetcode.common.ListNodeUtils;
import leetcode.temp.ListNode;

/**
 * @author ：liuxp
 * @date ：Created in 2020/4/8 17:29
 * @description ：
 *
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class _203 {

    public static void main(String[] args) {
        int val=6;
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(6);
        firstNode.next.next.next=new ListNode(3);
        firstNode.next.next.next.next=new ListNode(4);
        firstNode.next.next.next.next.next=new ListNode(5);
        firstNode.next.next.next.next.next.next=new ListNode(6);

//        TestLinkList linkList=new TestLinkList();
//        linkList.addNode(1);
//        linkList.addNode(2);
//        linkList.addNode(3);
//        linkList.addNode(4);
//        linkList.addNode(5);
//        linkList.addNode(6);
//        linkList.display();

        ListNodeUtils.printListNode(firstNode);

        ListNode resultNode = removeElements(firstNode, val);

        ListNodeUtils.printListNode(resultNode);

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode pre=temp;
        while(pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }else{
                pre=pre.next;
            }
        }
        return temp.next;

    }

}
