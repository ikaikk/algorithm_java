/**
 * 力扣141，判断是否有环形链表
 */
public class HasCycle {
    static class ListNode {
        int val;
        ListNode next;
    }

    public boolean hasCycleWithFastSlowHead(ListNode head) {
        if (null == head) {
            return false;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (fastNode == slowNode) {
                return true;
            }
        }

        return false;
    }

/*    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }

        HashMap<ListNode, Integer> map = new HashMap<>();
        int pos = -1;

        ListNode current = head;
        int i = 1;
        while (null != current.next) {
            if (map.containsKey(current)) {
                pos = map.get(current);
                return true;
            } else {
                map.put(current, i);
                current = current.next;
                i++;
            }
        }

        return false;
    }*/
}
