import java.util.ArrayList;
import java.util.List;

/**
 * 力扣234，回文链表
 */
public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }

        if (list.size() == 0) {
            return false;
        } else if (list.size() == 1) {
            return true;
        }

        int back;
        int forward;
        if (list.size() % 2 == 0) {
            back = list.size() / 2;
            forward = back - 1;
        } else {
            back = list.size() / 2 + 1;
            forward = back - 2;
        }

        for (; back < list.size(); back++) {
            if (!list.get(forward).equals(list.get(back))) {
                return false;
            }

            forward--;
        }

        return true;

    }
}
