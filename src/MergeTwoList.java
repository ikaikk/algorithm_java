import java.util.LinkedList;

/**
 * 力扣21，合并两个有序链表
 */
public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        result.val = -1;

        ListNode head = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }

            head = head.next;
        }

        head.next = list1 == null ? list2 : list1;

        return result.next;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    Integer val;
    ListNode next;
}
