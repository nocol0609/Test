package leetcode.temp;

/**
 * @author ��liuxp
 * @date ��Created in 2020/4/9 14:02
 * @description ��������
 */
public class TestLinkList {

    /**
     * ͷ�ڵ�
     */
    ListNode head;

    public TestLinkList() {
        head=null;
    }

    /**
     * ��ӽڵ�
     * @param val
     */
    public void addNode(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return;
        }

        ListNode temp=head;
        // ������β���
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    /**
     * �ڵ������ʾ
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
