package solution2

import spock.lang.Specification

class SolutionTest extends Specification {

    def solution = new Solution()

    def "AddTwoNumbers"() {
        setup:
        def listNode1 = new ListNode(2, new ListNode(3, new ListNode(4, null)))
        def listNode2 = new ListNode(5, new ListNode(6, new ListNode(4, null)))
        def listNodeResult = new ListNode(7, new ListNode(0, new ListNode(8, null)))
        when:
        def result = solution.addTwoNumbers(listNode1, listNode2)
        then:
        result == listNodeResult
    }
}
