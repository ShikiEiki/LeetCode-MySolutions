package frank.com.jnitest;

/**
 * Created by fuhan on 2017/1/15.
 */

public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnListNode = null;
        ListNode lastNode = returnListNode;
        boolean hasCarry = false;
        while (l1 != null || l2 != null){
            ListNode tempNode;
            if (l1 == null){
                tempNode = new ListNode(l2.val + (hasCarry ? 1 : 0));
                l2 = l2.next;
            }
            else if (l2 == null){
                tempNode = new ListNode(l1.val + (hasCarry ? 1 : 0));
                l1 = l1.next;
            }
            else {
                tempNode = new ListNode(l1.val + l2.val + (hasCarry ? 1 : 0));
                l1 = l1.next;
                l2 = l2.next;
            }
            if (tempNode.val > 9){
                tempNode.val = tempNode.val - 10;
                hasCarry = true;
            }
            else {
                hasCarry = false;
            }
            if (returnListNode == null){
                lastNode = tempNode;
                returnListNode = lastNode;
            }
            else {
                lastNode.next = tempNode;
                lastNode = lastNode.next;
            }
        }
        if (hasCarry){
            lastNode.next = new ListNode(1);
        }
        return returnListNode;
    }
}


