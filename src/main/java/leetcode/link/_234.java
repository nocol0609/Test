package leetcode.link;

import leetcode.temp.ListNode;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 16:55
 *
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 *
 */
public class _234 {

    public static void main(String[] args) {
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(3);
        firstNode.next.next.next=new ListNode(4);
        boolean palindrome = isPalindrome(firstNode);
        System.out.println(">>>>"+palindrome);
    }

    public static boolean isPalindrome(ListNode head) {
        Boolean flag=false;


        return flag;
    }

}
