package solution2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private ListNode l1;
    private ListNode l2;
    private ListNode resultTest;
    @Before
    public void setUp() {
        l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        resultTest = new ListNode(7, new ListNode(0, new ListNode(8, null)));
    }
    @Test
    public void addTwoNumbers() throws Exception {
        ListNode resultList = new Solution().addTwoNumbers(l1, l2);
        while (resultList.next != null) {
            assertTrue("Solution_2", resultList.val == resultTest.val);
            resultList = resultList.next;
            resultTest = resultTest.next;
        }
    }
}