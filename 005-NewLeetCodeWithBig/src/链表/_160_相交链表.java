package 链表;
/*
* https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
* */
public class _160_相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode curA = headA, curB = headB;
        while (curA != curB){
            curA = (curA == null) ? headB : curA.next;
            curB = (curB == null) ? headA : curB.next;
// 在两个链表不相交的似乎后会死循环
//            curA = (curA.next == null) ? headB : curA.next;
//            curB = (curB.next == null) ? headA : curB.next;
        }
        return curA;
    }
}
