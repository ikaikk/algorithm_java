package LinkedList;

public class AddInList {
    public static ListNode addInList (ListNode head1, ListNode head2) {
        if (null == head1) {
            return head2;
        }

        if (null == head2) {
            return head1;
        }

        ListNode list1 = reverse(head1);
        ListNode list2 = reverse(head2);
        ListNode result = new ListNode(-1);
        ListNode resultHead = result;

        boolean flag = false;
        while (null != list1 || null != list2) {
            int list1Val = 0;
            int list2Val = 0;
            if (null != list1) {
                list1Val = list1.val;
                list1 = list1.next;
            }

            if (null != list2) {
                list2Val = list2.val;
                list2 = list2.next;
            }

            int stepNum = 0;
            if (flag) {
                stepNum = 1;
            }
            int tempVal = list1Val + list2Val + stepNum;
            int num;
            if (tempVal >= 10) {
                num = tempVal - 10;
                flag = true;
            } else {
                num = tempVal;
                flag = false;
            }
            result.next = new ListNode(num);
            result = result.next;
        }

        if (flag) {
            result.next = new ListNode(1);
        }

        return reverse(resultHead.next);
    }

    private static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode preNode = null;
        while (null != current) {
            ListNode tempNode = current.next;
            current.next = preNode;
            preNode = current;
            current = tempNode;
        }

        return preNode;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(6);
        list1.next = new ListNode(2);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(3);

        ListNode listNode = addInList(list1, list2);
        while (null != listNode) {
            System.out.printf(listNode.val + "");
            listNode = listNode.next;
        }
        System.out.println();
    }
}
