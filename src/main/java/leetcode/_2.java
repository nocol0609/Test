package leetcode;

import leetcode.temp.ListNode;

import java.util.ArrayList;
import java.util.List;

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

//        System.out.println(firstNode.val);
//        System.out.println(secondeNode.val);


//        printListNode(firstNode);
//        printListNode(secondeNode);
//        ListNode listNode = addTwoNumbers(firstNode, secondeNode);
//        printListNode(listNode);

        System.out.println(21%10);
        System.out.println(21/10);


    }

    private static ListNode addTwoNumbers(ListNode node1, ListNode node2) {

        //(2 -> 4 -> 3) + (5 -> 6 -> 4)

        List<ListNode> nodeList=new ArrayList<>();
        nodeList.add(node1);
        nodeList.add(node2);
        //807
        String num=getSum(nodeList).toString();

        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            //substring是找出包含起始位置，不包含结束位置，到结束位置的前一位的子串
            arr[i] = Integer.parseInt(num.substring(i, i + 1));
        }

        ListNode node=null;
        ListNode tempNode;
        for (int i=arr.length-1;i>=0;i--){
            node=new ListNode(arr[i]);
            tempNode=new ListNode(arr[i-1]);
            node.next=tempNode;
        }
        return node;
    }

    private static Integer getSum(List<ListNode> nodeList) {
        Integer sum=0;
        for (ListNode node:nodeList){
            List<Integer> list=new ArrayList<>();
            ListNode tempNode=node;
            while (tempNode!=null){
                list.add(tempNode.val);
                tempNode=tempNode.next;
            }
            StringBuilder builder=new StringBuilder();
            for(int i=list.size()-1;i>=0;i--){
                builder.append(list.get(i));
            }
            sum+=Integer.parseInt(builder.toString());
        }
        return sum;
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
