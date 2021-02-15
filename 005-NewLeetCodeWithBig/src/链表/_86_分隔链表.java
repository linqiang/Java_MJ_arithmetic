package 链表;

//https://leetcode-cn.com/problems/partition-list/

public class _86_分隔链表 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return  null;
        ListNode lHead = new ListNode(0);
        ListNode lTail = lHead;

        ListNode rHead = new ListNode(0);
        ListNode rTail = rHead;

        while (head != null){
            if(head.val < x){  //放在lTail后面
                lTail.next = head;
                lTail = head;

            }else {
                rTail.next = head;
                rTail = head;
            }
            head = head.next;
        }
        //可能出现一下情况，原链表倒数第N个节点A 的值 是>= x 的，A后面的所有节点的值都是 <x 的，
        // 然后 rTail.next 最终其实就是 A.next
        rTail.next = null;

        //将 rHead.next拼接在LTail的后面
        lTail.next = rHead.next;
        return lHead.next;
    }
}
