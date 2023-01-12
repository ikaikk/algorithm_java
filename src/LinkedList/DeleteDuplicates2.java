package LinkedList;

public class DeleteDuplicates2 {
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public static ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (null == head) {
            return null;
        }

        if (null == head.next) {
            return head;
        }

        ListNode current = head;
        ListNode preNode = new ListNode(0);
        ListNode result = preNode;

        while (current != null) {
            if (50 == current.val) {
                System.out.println();
            }

            if (null != current.next && current.val == current.next.val) {
                int tempVal = current.val;
                current = current.next.next;
                while (null != current && current.val == tempVal) {
                    current = current.next;
                }
            } else {
                preNode.next = new ListNode(current.val);
                preNode = preNode.next;
                current = current.next;
            }
        }

        return result.next;
    }

    public static void main(String[] args) {
        int[] arr = {-50, -50, -50, -49, -49, -46, -44, -44, -43, -39, -39, -39, -39, -38, -38, -37, -37, -37, -35, -35, -35, -33, -33, -32, -31, -30, -29, -28, -27, -26, -25, -25, -24, -22, -21, -19, -19, -18, -18, -17, -16, -16, -15, -15, -14, -11, -10, -10, -10, -10, -9, -9, -9, -8, -6, -6, -6, -4, -1, 0, 0, 5, 6, 6, 7, 8, 8, 9, 10, 10, 10, 11, 12, 14, 14, 14, 15, 15, 15, 16, 17, 19, 19, 20, 20, 22, 22, 22, 23, 24, 24, 25, 25, 25, 25, 26, 27, 27, 27, 28, 29, 31, 32, 36, 36, 40, 40, 41, 43, 43, 46, 47, 48, 49, 49, 49, 50, 50};
        ListNode head = new ListNode(-1);
        ListNode current = head;
        for (int a : arr) {
            current.next = new ListNode(a);
            current = current.next;
        }

        ListNode listNode = deleteDuplicates(head.next);
        while (listNode != null) {
            System.out.printf(listNode.val + ",");
            listNode = listNode.next;
        }
        System.out.println();
    }
}
