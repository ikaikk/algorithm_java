package LinkedList;

/**
 * 链表内指定区域反转
 */
public class SegmentReverseList {

    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if (m == n) {
            return head;
        }

        ListNode current = head;
        ListNode startTail = null;
        ListNode segmentHead = null;
        ListNode lastHead = null;
        int i = 1;
        while(current != null) {
            if (i == m - 1) {
                startTail = current;
            } else if (i == m) {
                segmentHead = current;
            } else if (i == n + 1) {
                lastHead = current;
            }

            current = current.next;
            i++;
        }

        ListNode segment = reverse(segmentHead, m, n);
        if (startTail != null) {
            startTail.next = segment;
        } else {
            head = segment;
        }

        if (segmentHead != null) {
            segmentHead.next = lastHead;
        }

        return head;
    }

    public ListNode reverse(ListNode head, int m, int n) {
        ListNode current = head;
        ListNode preNode = null;
        int size = n - m + 1;
        int length = 1;
        while (current != null && length <= size) {
            ListNode tempNode = current.next;
            current.next = preNode;
            preNode = current;
            current = tempNode;
            length++;
        }

        return preNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);

        SegmentReverseList segmentReverseList = new SegmentReverseList();
        ListNode result = segmentReverseList.reverse(head, 1, 3);

        while (result != null) {
            System.out.print(result.val);
            System.out.print(",");
            result = result.next;
        }
        System.out.println();
    }
}
