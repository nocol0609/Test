package leetcode.link;

import leetcode.temp.ListNode;

/**
 * @author ：liuxp
 * @date ：Created in 2020/1/3 9:56
 * @description ：两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 */
class _2 {

    public static void main(String[] args) {
        ListNode firstNode=new ListNode(2);
        firstNode.next=new ListNode(4);
        firstNode.next.next=new ListNode(3);

        ListNode secondeNode=new ListNode(5);
        secondeNode.next=new ListNode(6);
        secondeNode.next.next=new ListNode(4);

        printListNode(firstNode);
        printListNode(secondeNode);
        ListNode listNode = addTwoNumbers(firstNode, secondeNode);
        printListNode(listNode);

    }

    private static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
        //2 -> 4 -> 3
        //5 -> 6 -> 4
        int carry=0;
        ListNode current=new ListNode(0);
        ListNode tempHead=current;
        while (node1!=null || node2!=null){
            int num1=node1.val;
            int num2=node2.val;
            int result=num1+num2+carry;
            carry=result/10;
            ListNode next=new ListNode(result%10);
            current.next=next;

            //继续往下移动
            current=current.next;

            //两个链表继续往下移动
            if(null!=node1){
                node1=node1.next;
            }
            if(null!=node2){
                node2=node2.next;
            }
        }
        //若最后的链表相加还需要进位，则需要创建新节点
        if(carry>0){
            current.next=new ListNode(carry);
        }
        return tempHead.next;
    }


    private static void printListNode(ListNode listNode) {
        if (listNode != null) {
            ListNode temp = listNode;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        System.out.println("-------------");
    }
}
