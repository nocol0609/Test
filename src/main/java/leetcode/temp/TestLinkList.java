package leetcode.temp;

/**
 * @author ：liuxp
 * @date ：Created in 2020/4/9 14:02
 * @description ：单链表
 */
public class TestLinkList {

    /**
     * 头节点
     */
    ListNode head;

    public TestLinkList() {
        head=null;
    }

    /**
     * 添加节点
     * @param val
     */
    public void addNode(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }

        ListNode temp=head;
        // 遍历到尾结点
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    /**
     * 节点遍历显示
     */
    public void display(){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.val+" ");
            current=current.next;
        }

        System.out.println();
    }

}
