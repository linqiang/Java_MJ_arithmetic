package 链表;

public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
//     val   if (head == null) return null;
//
//        //新链表头节点
//        ListNode newHead = null;
//        //新链表的尾节点
//        ListNode newTail = null;
//        while (head != null){
//            if(head.val != val){
//                newHead = head;
//                newTail = head;
//            }else{
//                newTail.next = head;
//                newTail = head;
//            }
//        }
//        head = head.next;
//    }
//    return newHead;
//

        if (head == null) return  null;
        //新链表的头节点
        ListNode newHead = new ListNode(0);
        //新链表的尾节点
        ListNode newTail = newHead;

        while (head != null){
            if (head.val != val){
                newTail.next = head;
                newTail = head;
            }
            head = head.next;
        }
        newTail.next = null;
        return  newHead.next;
    }
}
