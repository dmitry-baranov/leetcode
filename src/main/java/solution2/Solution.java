package solution2;

class Solution {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode(0);
        ListNode list = resultList;
        int increment = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = increment + x + y;
            increment = sum / 10;
            list.next = new ListNode(sum % 10);
            list = list.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (increment > 0) {
            list.next = new ListNode(increment);
        }
        return resultList.next;
    }
}


