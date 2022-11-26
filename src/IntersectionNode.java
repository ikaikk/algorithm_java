/**
 * 力扣160，相交链表
 */
public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB) {
            if (ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }

            if (ptrB == null) {
                ptrB = headA;
            } else {
                ptrB = ptrB.next;
            }
        }

        return ptrA;
    }
}
